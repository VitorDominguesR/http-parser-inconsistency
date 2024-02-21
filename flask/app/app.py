from flask import Flask

app = Flask(__name__)


@app.route('/admin', methods=['GET'])
def admin():
    return "Admin Panel"


@app.route('/')
def home():
    return "hello world!"


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=3000)
