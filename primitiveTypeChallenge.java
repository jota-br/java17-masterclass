byte myByte = 10;
short myShort = 20;
int myInt = 50;
long myLong = 50000L;
long myTotal = (long) ((myByte + myShort + myInt) * 10) + myLong;
long myTotal = 50000L ((myByte + myShort + myInt) * 10); // When a long starts the expression we don't need to cast


