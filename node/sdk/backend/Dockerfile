FROM node:18.8-alpine3.16

WORKDIR /app/
COPY package.json /app/

RUN npm i -g add pm2 && npm i

COPY . /app/

CMD [ "pm2", "start", "server.js", "--no-daemon", "-i", "0" ]

EXPOSE 3000