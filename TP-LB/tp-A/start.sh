docker build -t im-nginx-lb .

mkdir -p shared1
mkdir -p shared2

echo "<h1>Hello 1</h1>" > shared1/index.html
echo "<h1>Hello 2</h1>" > shared2/index.html

docker run -d \
    --name nginx1 \
    -p 81:80 \
    -v $(pwd)/shared1:/usr/share/nginx/html \
    --rm \
    nginx:latest

docker run -d \
    --name nginx2 \
    -p 82:80 \
    -v $(pwd)/shared2:/usr/share/nginx/html \
    --rm \
    nginx:latest

docker run -d -p 83:80 \
    --name load_balancer \
    --rm \
    im-nginx-lb
