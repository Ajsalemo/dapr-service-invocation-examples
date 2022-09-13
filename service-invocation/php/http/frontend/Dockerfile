FROM composer:2.4.1 as build

COPY . /app/
RUN composer install --prefer-dist --no-dev --optimize-autoloader --no-interaction

FROM php:8.1.10-apache-buster as production

COPY --from=build /app /var/www/html
COPY apache/000-default.conf /etc/apache2/sites-available/000-default.conf

# Change permissions to read/write for storage or else it'll fail to write out logs due to lack of permissions
# Change ownership to www-data for Apache
RUN chmod 777 -R /var/www/html/storage/ && \
    chown -R www-data:www-data /var/www/

EXPOSE 80