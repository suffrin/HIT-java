window.onload = initAll;

function initAll() {

	var ans=prompt("Are you sure you want to do that?","");
	
	if(ans){
		alert("You said " +ans);
		document.write("You said"+ans);
	}
	else{
		alert("You refused to answer");
	}

}