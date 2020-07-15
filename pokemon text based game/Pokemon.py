class Pokemon:

# An object is basically a data type that you create. Normally, the data types are string, number, boolean, etc. But sometimes these default data type is not enough to describe the thing that we want
# So what we do is we create our own data type. When we create our own data type, they are actually called "objects". You create your own object by creating a class, aka a .py file.
# An object can have its own attributes which is what we're doing below.

    #This line defines what the attributes of the object Pokemon will be.
    def __init__(self, name, hp, attacks):
        self.name = name
        self.hp = hp
        self.attacks = attacks

    def make_growl(self):
        print(self.name + " growled!")