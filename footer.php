<p style="border-top: 4px double green;">
<?php
// outputs e.g. 'Last modified: March 04 1998 20:43:59. '
$currentFile = basename($_SERVER["PHP_SELF"]);
echo "Last update: " . date ("F d Y H:i:s.", filemtime($currentFile));
?>
 CSS Template obtained from <a href="http://www.modelum.es/MLContext">http://www.modelum.es/MLContext </a>
</p>
</body>
</html>
