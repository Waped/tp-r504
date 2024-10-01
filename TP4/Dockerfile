FROM python:3.11-slim-bullseye

RUN apt-get update && apt-get upgrade -y
RUN apt-get install -y build-essential pkg-config default-libmysqlclient-dev
RUN pip install flask-mysqldb mysql-connector-python



COPY index.html /srv/templates/
COPY app_1.py /srv/

EXPOSE 5000

CMD ["flask", "--app", "/srv/app_1.py", "run", "--host=0.0.0.0","--debug"]