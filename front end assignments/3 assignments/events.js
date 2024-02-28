 // Get the button element
 const dateButton = document.getElementById('dateButton');

 // Add event listener to the button
 dateButton.addEventListener('click', function() {
   // Get the current date and time
   const currentDate = new Date();
   
   // Format the date and time
   const formattedDateTime = currentDate.toLocaleString();

   // Display the formatted date and time
   alert('Current Date and Time: ' + formattedDateTime);
 });


 // Get the form element
 const form = document.getElementById('myForm');

 // Add event listener to the form for form submission
 form.addEventListener('submit', function(event) {
   // Prevent the default form submission behavior
   event.preventDefault();

   // Get the value of the text input
   const textInput = document.getElementById('textInput').value;

   // Check if the text input is empty
   if (textInput.trim() === '') {
     // If it's empty, show an alert and prevent the form from being submitted
     alert('Please enter some text!');
     return;
   }

   // If the text input is not empty, proceed with form submission
   // You can add additional validation or submit the form data to the server here
   alert('Form submitted successfully!');
   // Optionally, you can submit the form programmatically
   // form.submit();
 });


 let x = 10;
console.log(x); // Output: 10


function add(a, b) {
    return a + b;
  }
  console.log(add(5, 3)); // Output: 8

  
  console.log('Before if statement');
if (true) {
  console.log('Inside if statement');
}
console.log('After if statement');



const person = { name: 'John', age: 30 };
console.log(person.name); // Output: John


let y = 0;
console.log('Before division');
console.log(10 / y); // Output: Infinity (division by zero error)



let status = 'Error';
console.log('Status:', status); // Output: Status: Error


// Function to set a cookie
function setCookie(name, value, days) {
    const expires = new Date();
    expires.setTime(expires.getTime() + (days * 24 * 60 * 60 * 1000));
    document.cookie = `${name}=${value};expires=${expires.toUTCString()};path=/`;
  }
  
  // Function to get a cookie by name
  function getCookie(name) {
    const cookies = document.cookie.split(';');
    for (let cookie of cookies) {
      const [cookieName, cookieValue] = cookie.trim().split('=');
      if (cookieName === name) {
        return cookieValue;
      }
    }
    return null;
  }
  
  // Function to check if a cookie exists
  function checkCookie(name) {
    return getCookie(name) !== null;
  }
  
  // Usage examples
  setCookie('username', 'John', 30); // Set a cookie named 'username' with value 'John' that expires in 30 days
  const username = getCookie('username'); // Get the value of the cookie named 'username'
  console.log('Username:', username); // Output: Username: John
  const hasUsernameCookie = checkCookie('username'); // Check if a cookie named 'username' exists
  console.log('Has username cookie:', hasUsernameCookie); // Output: Has username cookie: true or false

  

  // Create a JSON object
const person = {
    name: 'John',
    age: 30,
    address: {
      city: 'New York',
      country: 'USA'
    }
  };
  
  // Access the JSON object using dot notation
  console.log('Name:', person.name); // Output: Name: John
  console.log('Age:', person.age); // Output: Age: 30
  console.log('City:', person.address.city); // Output: City: New York
  console.log('Country:', person.address.country); // Output: Country: USA
  