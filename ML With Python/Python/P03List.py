fruits = ["Apple", "Banana", "Cherry", "Mango"]
print("Fruits List: ", fruits)

print("First fruit: ", fruits[0])
print("Last fruit: ", fruits[-1])

print("First two fruit: ", fruits[:2])
print("Last two fruit: ", fruits[-2:])


#Updating an element
fruits[1] = "Bluberry"
print("updated list: ", fruits)

#Adding elements
fruits.append("Orange")
print("After Append: ", fruits)

#insert at index 2
fruits.insert(2, "Pineapple")
print("After Insert: ", fruits)

#remooving elements
fruits.remove("Cherry")
print("After remove: ", fruits)

#deletes element at index 0
print("After Deleting First element: ", fruits)

numbers = [5,2,9,1,7]

print("Length of list: ", len(numbers))     #find length of list
print("Maximum of list: ", max(numbers))     #find Maximum value
print("Minimum of list: ", min(numbers))     #find minimum value

#convert in Acsending order
numbers.sort () #sort
print("Sorted List: ", numbers)

#convert in Desending order
numbers.reverse()
print("Reversed List: ", numbers)

# Creating a Tuple
colors = ("Red", "Green", "Blue", "Yellow")
print("Colors Tuple: ", colors)

print("First color: ", colors[0])
print("Last color: ", colors[-1])
print("First Two colors: ", colors[:2]) 

for color in colors:
    print(color)

#Tuple concatenation
new_colors =  colors + ("Purple", "Orange")
print("Concatenated Tuple: ", new_colors)

#Tuple repetition
repeated_colors = colors * 2
print("Repeated Tuple: ", repeated_colors)

#Tuple unpacking
r, g, b, y= colors
print("Unpacking: ",r,g,b,y)

#converting a tuple to a list
colors_list = list(colors)
print("Tuple to List: ", colors_list)

#converting a tuple to a list
colors_tuple = tuple(colors)
print("List to Tuple: ", colors_tuple)