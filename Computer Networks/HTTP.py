import socket
HOST = '127.0.0.1'
PORT =8080

server_socket=socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind((HOST,PORT))
server_socket.listen(5)

print("HTTP Server running on port 8080...")

while True:
    client_socket, addr = server_socket.accept()
    print(f"Connection from {addr}")

    request = client_socket.recv(1024).decode()
    print("Request:\n", request)

    response= """HTTP/1.1 200 OK
Context-Type;text/html

<html>
<body>
<h1>Hello Student SYMBIOSIS good morning</h1>
</body>
</html>
"""