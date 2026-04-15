import socket

# Create socket
server = socket. socket()

# Bind IP and Port
server.bind(("localhost", 5000))

# Listen for clients
server.listen(1)
print("Server waiting for connection.")
conn, addr=server.accept()
print("Connected to:",addr)
while True:
    msg=conn.recv(1024).decode()
    if msg.lower()=="exit":
        break
    print("Client: ",msg)