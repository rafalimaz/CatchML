<?php include ('header.php'); ?>

<!-- Main content-->
<div id="main">
<div class="submain">
<h1>Installing the CatchML Plugin for Eclipse</h1>

<h2>From Update Site (Remote Update)</h2>
Link: http://www.great.ufc.br/~rafaellima/catchml/updatesite
<ol>
<li>In Eclipse, choose <strong>Help &gt; Install New Software...</strong></li>
<li>In the "Work with" section, copy and paste the <a href="/~rafaellima/catchml/updatesite">update site link</a> 
and then click the <b>Add...</b> button. </li>
<li>The "Add Repository" dialog box appears. Choose a "Name" for the update site and click "Ok".</li>
<li>Select the CatchML SDK Feature component.</li>
<li>Click <b>Next</b> to review the list of items to be installed, click <b>Next</b> again to read and accept the license agreements, then click <b>Finish</b>.
  Eclipse will then install any external dependencies, and add the chosen components to the Eclipse installation.</li>
<li>When asked, restart Eclipse.</li>
</ol>

<h2>From Local folder (Local Update) </h2>
<ol>
  <li>Download <a href="/~rafaellima/catchml/updatesite.zip">the latest update site archive for Eclipse 4.2</a>.</li>
  <li>Unzip the archive.</li>
  <li>In Eclipse, choose <strong>Help &gt; Install New Software...</strong></li>
  <li>In the "Work with" section, click the <b>Add...</b> button.  The "Add Repository" dialog box appears.</li>
  <li>Click <b>Local</b> and select the directory you unzipped, then click <b>OK</b>.  Its path appears in the "Location" field.  Leave the "Name" field empty.</li>
  <li>Select the CatchML SDK Feature component.</li>
  <li>Click <b>Next</b> to review the list of items to be installed, click <b>Next</b> again to read and accept the license agreements, then click <b>Finish</b>.
      Eclipse will then install any external dependencies, and add the chosen components to the Eclipse installation.</li>
  <li>When asked, restart Eclipse.</li>
  </li>
</ol>

<p>The plugin should now be installed!</p>
</div>
</div>
<br/>

<?php include ('footer.php'); ?>