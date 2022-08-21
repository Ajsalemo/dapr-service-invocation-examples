from dapr.clients import DaprClient
from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return { "msg": "dapr-examples-python-service-invocation-frontend" }


@app.route("/api/dapr")
def dapr():
    d = DaprClient()
    res = d.invoke_method(
        'backend',
        'api/backend'
    )
    return { "artists": res.json() }


