declare P(int x, int y).
declare Q(int x).

P(x, y) :- x = 0, y = 1.
P(x, y) :- x = 1, y = 4.
P(x, y) :- x = 2, y = 4.
P(x, y) :- x = 3, y = 1.

Q(x) :- t == x + x, z = t, P(x, z), t = 4.
