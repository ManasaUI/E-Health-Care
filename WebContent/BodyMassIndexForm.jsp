<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center>
	<h4>Calculate your BODY MASS INDEX(BMI)</h4>
</center>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>bodymassindexform</title>
</head>
<body background="Images/Hospital.jpg">
	<center>
		<form name="bmiForm">
			<table>
				<tr>
					<td>Enter Weight(kg):</td>
					<td><input type="text" name="weight" size="10"></td>
				</tr>
				<tr>
					<td>Enter Height(cm):</td>
					<td><input type="text" name="height" size="10"></td>
				</tr>
			</table>
			<input type="button" value="Calculate BMI" onClick="calculateBmi()"><br></br>
			<table>
				<tr>
					<td>BMI Value:</td>
					<td><input type="text" name="bmi" size="25"></td>
				</tr>
				<tr>
					<td>Message:</td>
					<td><input type="text" name="meaning" size="25"></td>
				</tr>
			</table>
			<input type="reset" value="Reset" />

		</form>
		<br></br>
		Click here to go <a href="/E-Health_Care/Home.html">Home Page</a>

	</center>
</body>
<script language="JavaScript">
	function calculateBmi() {
		var weight = document.bmiForm.weight.value
		var height = document.bmiForm.height.value
		if (weight > 0 && height > 0) {
			var finalBmi = weight / (height / 100 * height / 100)
			document.bmiForm.bmi.value = finalBmi
			if (finalBmi < 18.5) {
				document.bmiForm.meaning.value = "you are too thin."
			}
			else if (finalBmi > 18.5 && finalBmi < 25) {
				document.bmiForm.meaning.value = "you are healthy."
			}
			else if (finalBmi > 25) {
				document.bmiForm.meaning.value = "you have overweight."
			}
		} else {
			window.alert("Please Fill in everything correctly")
		}
	}
</script>

</html>