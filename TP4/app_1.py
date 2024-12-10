import re
from flask import Flask, render_template
import mysql.connector

app = Flask(__name__)
 
# MySQL configuration
db_config = {
    'host': 'tp4-sql',
    'user': 'root',
    'password': 'foo',
    'database': 'demosql'
}

pattern = "[]"

@app.route('/newuser/', methods=['GET', 'POST'])
def new_user():
    error_messages = []  # Liste pour les erreurs de validation
    if request.method == 'POST':
        username = request.form['username']

        

    
    return render_template('newuser.html')

if __name__ == '__main__':
    app.run(debug=True)


