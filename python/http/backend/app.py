from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return { "msg": "dapr-examples-python-state-management-backend" }


@app.route("/api/backend")
def dapr():
    arr = ["Michelangelo", "Van Gogh", "Picasso", "Goya"]
    return arr

