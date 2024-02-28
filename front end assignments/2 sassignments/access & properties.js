
function hideButton(button) {
  button.style.display = 'none';
}

// Define a simple function
function greet(name) {
    console.log(`Hello, ${name}!`);
  }
  
  // Using call() to invoke the function
  greet.call(null, 'Alice');
  
  // Using apply() to invoke the function
  greet.apply(null, ['Bob']);

  

  // Get the button and count span elements
const countButton = document.getElementById('countButton');
const countSpan = document.getElementById('count');

// Initialize the count value
let count = 0;

// Function to increment the count and update the display
function incrementCount() {
  count++;
  countSpan.textContent = count;
}

// Add event listener to the button
countButton.addEventListener('click', incrementCount);




// Counter class
class Counter {
    constructor() {
      this._count = 0; // Initialize count to 0
    }
  
    // Getter for count
    get count() {
      return this._count;
    }
  
    // Setter for count
    set count(value) {
      if (value >= 0) {
        this._count = value;
      } else {
        console.error('Count must be a non-negative number');
      }
    }
  
    // Method to increment count
    increment() {
      this._count++;
    }
  
    // Method to decrement count
    decrement() {
      if (this._count > 0) {
        this._count--;
      } else {
        console.error('Count cannot be negative');
      }
    }
  }
  
  // Create an instance of Counter
  const counter = new Counter();
  
  // Test the counter
  console.log(counter.count); // Output: 0
  
  counter.increment();
  console.log(counter.count); // Output: 1
  
  counter.decrement();
  console.log(counter.count); // Output: 0
  
  counter.count = 5; // Using the setter
  console.log(counter.count); // Output: 5
  
  counter.count = -1; // Error: Count must be a non-negative number

  

  // Define the existing function
function Person(name, age) {
    this.name = name;
    this.age = age;
  }
  
  // Add more properties to the function using prototypes
  Person.prototype.city = 'Unknown';
  Person.prototype.sayHello = function() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old. I live in ${this.city}.`);
  };
  
  // Create an instance of Person
  const john = new Person('John', 30);
  
  // Access the properties and methods
  console.log(john.name); // Output: John
  console.log(john.age); // Output: 30
  console.log(john.city); // Output: Unknown (inherited from prototype)
  john.sayHello(); // Output: Hello, my name is John and I am 30 years old. I live in Unknown.
  