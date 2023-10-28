import time

a = 3.1415926
b = 2.718
print('Speed test ran Python!')
start = time.time()

for i in range (1, 100000000):
    a+=b

end = time.time()
print('Python: ' + str(float(round(((end-start)*1000),3))) + 'ms')
print(int(a))