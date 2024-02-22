from flask import Flask
from requests import get

app = Flask('__main__')
SITE_NAME = 'https://google.com'  # flaw: should be https://google.com/


@app.route('/', defaults={'path': ''})
@app.route('/<path:path>')
def proxy(path):
    return get(f'{SITE_NAME}{path}').content


if __name__ == "__main__":
    app.run(threaded=False, host='0.0.0.0', port=3000)
