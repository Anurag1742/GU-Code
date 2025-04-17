# creating a Dictionary
Student_scores = {
    "Alice":85,
    "Bob":78,
    "Charlie":98,
    "David":88
} 
print("Student Scores Dictinory: ", Student_scores)

 
# Accessing a value using a key
print("Alice Scores:", Student_scores["Alice"])

#using the get() method (avoid errors if the key is not found)

print("Charlie's Scores ", Student_scores.get("Charlie") )

# Trying to Access a non-existent key(returns Non insted of an error)

#print("Ev's Scores:, Student_Scores.get("Eve","Not Found "))


#Adding and updating 

Student_scores["Alice"]=95
print("Updated Dictionary:", Student_scores)

#Updating an existing value
Student_scores["Bob"] = 80
print("After Updating Bob's Score: ", Student_scores)


#1.4: Removing Elements from a Dictionary
#Removing the key-vaalue pair using del
del Student_scores["Alice"]
print("After Deleting Alice: ", Student_scores)

#Using pop() to remove and return the value
removed_score = Student_scores.pop("charlie")
print("Removed Charlie ",removed_score)
print("After removing Charlie: ",Student_scores)

#Looping through values
for student in Student_scores:
    print("Student: ",student)

#Looping through values
for score in Student_scores.values():
    print("Score: ",score)

#Looping through key-values pairs
for student, score in Student_scores.times():
    print(f"{student}: {score}")
    
#Clearing all elements in the dictionary
Student_scores.clear()
print("Dictionary after clearing: ",Student_scores)

#2.2: Adding and removing elements
#Adding elements to a set
numbers.add(6)
print("After adding 6: ",numbers)

#using discard() (does not raise an error if element is missing)
numbers.discard(10) #No error if 10 is not found
print("After Discarding 10: ", numbers)

#Removing and returning a random element
removed_element = numbers.pop()
print("Removed element:",removed_element)
print("After Pop: ",numbers)