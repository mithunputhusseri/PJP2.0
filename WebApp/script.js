function convertDate(d)
{
	var d1 = d.split("/");
    var date = new Array();
    date.push(parseInt(d1[0]));
    date.push(parseInt(d1[1]));
    date.push(parseInt(d1[2]));
    return date;
}
function dateCalc()
{
	var d2 = document.getElementById("date");
	var f2 = document.getElementById("func"); 
	var d = d2.value;
	var f = f2.value;
    document.getElementById("out").textContent = d + "  " + f;

    processDate(d,f);
}

function processDate(d,f)
{
	var date = convertDate(d);
	console.log(date);
	var f1 = f.split(" ");
	if(f1.length == 2)
	{
		if(f1[0] == "difference")
			date_diff(date,convertDate(f1[1]));
		if(f1[0] == "add")
			date_add(d,parseInt(f1[1]));
	}
	if(f1.length == 1)
	{
		if(f1[0] == "nextday")
			date_add(d,1);
		else if(f1[0] == "tommorow")
			date_add(d,1);
		else if(f1[0] == "yesterday")
			date_add(d,-1);
		else if(f1[0] == "nextweek")
			date_add(d,7);
		else if(f1[0] == "lastweek")
			date_add(d,-7);
		else if(f1[0] == "nextyear")
			date_add(d,365);
		else if(f1[0] == "lastyear")
			date_add(d,-365);
		else if(f1[0] == "nextmonth")
			date_add(d,30);
		else if(f1[0] == "lastmonth")
			date_add(d,-30);
		else
			alert("wrong input");
	}
	if(f1.length == 3)
	{
		if(f1[0] == "after")
		{
			if(f1[2] == "days") date_add(d, parseInt(f1[1]));
			else if(f1[2] == "months") date_add(d, 30*parseInt(f1[1]));
			else if(f1[2] == "weeks") date_add(d, 7*parseInt(f1[1]));
			else if(f1[2] == "years") date_add(d, 365*parseInt(f1[1]));
			else alert("wrong input");
		}
		if(f1[0] == "before")
		{
			if(f1[2] == "days") date_add(d, -1*parseInt(f1[1]));
			else if(f1[2] == "months") date_add(d, -30*parseInt(f1[1]));
			else if(f1[2] == "weeks") date_add(d, -7*parseInt(f1[1]));
			else if(f1[2] == "years") date_add(d, -365*parseInt(f1[1]));
			else alert("wrong input");
		}
	}
}

function countLeapYears(d)  
	{ 
	var years = d[2]; 
	if (d[1] <= 2)  
	{ 
	years--; 
	} 
	return Math.floor(years / 4) - Math.floor(years / 100) + Math.floor(years / 400); 
	} 
function date_diff(dt1,dt2)
{
		console.log(dt1);
		console.log(dt2);
		var monthDays  = [31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31];
	    var n1 = dt1[2] * 365 + dt1[0]; 
        for (var i = 0; i < dt1[1] - 1; i++)  
        { 
            n1 += monthDays[i]; 
        }
        n1 += countLeapYears(dt1); 
        var n2 = dt2[2] * 365 + dt2[0]; 
        for (var i = 0; i < dt2[1] - 1; i++) 
        { 
            n2 += monthDays[i]; 
        } 
        n2 += countLeapYears(dt2); 
        document.getElementById("out").textContent = n2-n1;
}

function date_add(d,n)
{
	var date = new Date(d);
	console.log(d + " " + n);
    date.setDate(date.getDate() + n);
    console.log(date);
    console.log(date.getDay());
    document.getElementById("out").textContent = (date.getMonth()+1) + "/" + date.getDate() + "/" + date.getFullYear();
     document.getElementById("date").textContent = (date.getMonth()+1) + "/" + date.getDate() + "/" + date.getFullYear();
}