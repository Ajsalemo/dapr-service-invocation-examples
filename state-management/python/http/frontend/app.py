import requests
from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return { "msg": "dapr-examples-python-state-management-frontend" }


@app.route("/api/dapr")
def dapr():
    r = requests.get("http://localhost:3500/invoke/python/method/api/backend")
    return { "artists": r.json() }


