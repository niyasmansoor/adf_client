<!DOCTYPE html>
<html>
<head>
<title>ADF File Upload Screen</title>

<style type="text/css">
.centered {
	width: 100%;
	margin-left: auto;
	margin-right: auto;
	text-align: center;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}

#scores {
	width: 60%;
	border-collapse: collapse;
}

#scores td,#scores th {
	font-size: 0.7em;
	border: 1px solid #98bf21;
	padding: 3px 7px 2px 7px;
}

#scores th {
	font-size: 1em;
	text-align: center;
	padding-top: 5px;
	padding-bottom: 4px;
	background-color: #A7C942;
	color: #ffffff;
}

#scores tr.alt td {
	color: #000000;
	background-color: #EAF2D3;
}

#scores td.rit {
	text-align: right;
}
</style>

<script src="scripts/jquery-1.8.2.js"></script>
<script src="scripts/jquery.ajaxfileupload.js"></script>
<script lang="Javascript">
$(document).ready(function() {
	$('input[type="file"]').ajaxfileupload({
		'action' : 'UploadFile',
		'onComplete' : function(response) {
			$('#upload').hide();
			$('#message').show();
			
			var statusVal = JSON.stringify(response.status);

			if(statusVal == "false")
			{
				$("#message").html("<font color='red'> Error ! Score could not be calculated . Uploaded file is of either wrong type or format . Only XML files are allowed with proper ADF format . </font>");
			}	
			if(statusVal == "true")
			{
				$("#message").html(response.message);
			}			
		},
		'onStart' : function() {
			$('#upload').show();
			$('#message').hide();
		}
	});
});


</script>

</head>
<body>
	<table width=80% " height="618" bgcolor="#d6d6d6" align="center">
		<tr>
			<td>
				<form>
					<div class="centered">
						<br />
						<h2>Auto Lead Data Format Score Calculator</h2>
						<b>Please upload ADF format XML file to calculate scores : </b> <input
							type="file" name="file" /><br />
						<br />

						<div id="upload" style="display: none;">Uploading..</div>

						<div id="message" align="center"></div>
					</div>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>