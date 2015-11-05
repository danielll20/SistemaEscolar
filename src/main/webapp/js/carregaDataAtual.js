function carregaData(){   
	var d=new Date();  
	var monthname=new Array("01","02","03","04","05","06","07","08","09","10","11","12");  
	var TODAY = d.getDate() + "/" +monthname[d.getMonth()] +  "/" + d.getFullYear();  
	formMatricula.dataMatricula.value = TODAY;    
}