enum Compass { NORTH, EAST, SOUTH, WEST }

def s = "${'south'.toUpperCase()}"

def west = s as Compass
println west.class
