# ipaddresscounter
For storing unique IP addresses BitSet is used. Particularly, as we have IPv4 addresses, then it can be converted to Java's int primitive (32 bits).
Then, converted ip address can be used as index to set the bit in BitSet.
In addition, as some addresses can be converted to negative numbers we can use separate BitSet for such addresses.
So, we can change the sign of the number and set it to BitSet, then we can just sum amount of set bits from both BitSets (positive and negative).

The application is implemented as simple console app. It can be built to jar with manifest using maven (clean package).
The app accepts one argument - path to file with ip addresses.
