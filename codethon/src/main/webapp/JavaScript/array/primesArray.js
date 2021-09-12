window.onload = initAll;

function initAll() {
	var ans = prompt("How many prime numbers to display?","10");
	try {
		if (!ans || isNaN(ans) || ans <= 0 || Math.round(ans) != ans) {
			throw new Error("Not a valid number");
		}
		calculatePrimesArray(ans);
	}
	catch (errMsg) {
		alert(errMsg.message);
	}
}

function calculatePrimesArray(numberOfPrimes) {
	// array for primes
	
	// add 2 to prime array
	if (numberOfPrimes >= 1) {
		
	}
	
	var lastTested = 2;
	// loop while array needs primes added
	while (   ) {
		// increment tested number
		lastTested++;
		
		// pass to function to test
		var isPrime = testForPrime(lastTested, primes);
		
		// if prime add to array
		if (isPrime) {
			
		}
	}
		
	displayPrimes(numberOfPrimes, primes);
}

function testForPrime(numberToTest, primes) {
	var upperLimit = Math.ceil(Math.sqrt(numberToTest));
	
	// loop until prime divisor is greater than upper limit to test
	for (var i = 0;    ; i++) {
		if (     ) {
			return false;
		}
	}
	// after loop number must be prime
	return true;
}

function displayPrimes(numberOfPrimes, primes) {
	document.write("You wanted this many primes: " + 
		numberOfPrimes + "<br/>");
	
	// add primes to end of display text
	document.write("The first " + numberOfPrimes + 
		" prime numbers are: " );
}

