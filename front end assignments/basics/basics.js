// This is a single-line comment
// It is used to provide explanations or notes within the code

/*
  This is a multi-line comment.
  It can span multiple lines and is often used for longer explanations or commenting out blocks of code.

  Below is a simple JavaScript program that prints a message to the console.
*/

console.log("Hello, world!"); // Print "Hello, world!" to the console


<script>
<h2>Fruits List</h2>

<ul id="fruitsList">
  <li>Apple</li>
  <li>Banana</li>
  <li>Orange</li>
  <li>Mango</li>
  <li>Grapes</li>
</ul>

<button onclick="sortFruits()">Sort Descending</button>
<script>
function sortFruits() {
  // Get the list of fruits
  var fruitsList = document.getElementById('fruitsList');

  // Convert the list to an array
  var fruitsArray = Array.from(fruitsList.children);

  // Sort the array in descending order
  fruitsArray.sort(function(a, b) {
    return (b.textContent.localeCompare(a.textContent));
  });

  // Clear the list
  fruitsList.innerHTML = '';

  // Append sorted items to the list
  fruitsArray.forEach(function(item) {
    fruitsList.appendChild(item);
  });
}
</script>
// Define an object with some properties
var person = {
  firstName: "John",
  lastName: "Doe",
  age: 30,
  email: "john@example.com"
};

// Iterate over the properties of the object using a for...in loop
for (var key in person) {
  // Check if the property is a direct property of the object (not inherited)
  if (person.hasOwnProperty(key)) {
    console.log(key + ": " + person[key]);
  }
}



// Create an object "person" with properties "firstName" and "lastName"
var person = {
  firstName: "John",
  lastName: "Doe"
};

// Accessing properties using dot notation
console.log("Using dot notation:");
console.log("First Name: " + person.firstName);
console.log("Last Name: " + person.lastName);

// Accessing properties using bracket notation
console.log("\nUsing bracket notation:");
console.log("First Name: " + person['firstName']);
console.log("Last Name: " + person['lastName']);



'use strict';

// Using strict mode ensures more stringent error handling and prevents certain actions that are considered unsafe or problematic

// Create an object "person" with properties "firstName" and "lastName"
var person = {
  firstName: "John",
  lastName: "Doe"
};

// Accessing properties using dot notation
console.log("Using dot notation:");
console.log("First Name: " + person.firstName);
console.log("Last Name: " + person.lastName);

// Accessing properties using bracket notation
console.log("\nUsing bracket notation:");
console.log("First Name: " + person['firstName']);
console.log("Last Name: " + person['lastName']);

/