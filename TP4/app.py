from flask import Flask, render_template, request
import re

app = Flask(__name__)

@app.route('/')
def index():
    return "Bienvenue sur l'application Flask !"

# Endpoint pour afficher le formulaire
@app.route('/newuser/', methods=['GET', 'POST'])


if __name__ == '__main__':
    app.run(debug=True)

