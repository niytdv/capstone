import socket

client=socket.socketclient.connect(("localhost",5000))
while True:
    msg=input("You: ")
    client.send(msg.encode())
    if msg.lower()=="exit":
        break
    reply = client.recv(1024).decode()
    print("Server:",reply)
client.close()