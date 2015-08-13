<?php include ('header.php'); ?>

<!-- Main content-->
<div id="main">
<div class="submain">
<h1>CatchML Features</h1>
CatchML is an Eclipse plug-in generated with Xtext with the following features:

<ul>
  <li>A grammar that allows specify context aware exception handling of ubiquitous systems.</li>
  <li>An editor with syntax highlighting, an outline and hyperlinks.</li>	
  <li>A parser that takes a source model expressed in its textual
syntax and generates a model conforming to its metamodel.</li>
  <li>Integration with JCAEHV enabling model verification and report generation.</li>
  <li>Presentation of JCAEHV errors directly in source code.<br> </li>
</ul>

The high-abstraction level of CatchML let us write shorter and clearer context aware exception handling models. 
<a href="ubiParking.php">Here</a> is an example of an CatchML model specification and the <a href="ubiParking_JCAEHV.php">same model using JCAEHV</a>. 
Both models contains the same exception handling information.
</div>
</div>
<br/>

<?php include ('footer.php'); ?>
