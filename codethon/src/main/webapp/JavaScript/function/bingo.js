window.onload = initAll;

function initAll() {
	if (document.getElementById) {
		document.getElementById("pick").onClick = displayNumber();
	}
	else {
		alert("Sorry, your browser doesn't support this script");
	}
}

function displayNumber() {
	var number = generateNumber();
	document.getElementById("number").innerHTML = 
		"The next BINGO number is :" + number[0] + " - " + number[1];
}

function generateNumber() {
	 var columnLabel = new Array("B", "I", "N", "G", "O");
	 var columnIndex = Math.floor(Math.random() * 5);
	 var newNum = Math.floor(Math.randow() * 15) + 1 
	 	+ (columnIndex * 15);
	 return new Array (columnLabel[columnIndex], newNum);
}
