// base dir
var path = "/scripts/";

// interface language
var language = "de";

/**
 * Known dialogs with associated information
 * Parameters (in order of appearance):
 * - HTML or script file
 * - Characters
 * - Show emotion
 * - Show default mood
 * - Show moodg
 * - Show mood tendency
 * - Query the user after playing the script
 */
var dialogs = new Array (
  "intro.html",
  "",
  false,
  false,
  false,
  false,
  false,

  "questionaire1.html",
  "",
  false,
  false,
  false,
  false,
  false,

  "questionaire2.html",
  "",
  false,
  false,
  false,
  false,
  false,

  "questionaire_emotions.html",
  "",
  false,
  false,
  false,
  false,
  false,

  "Evaluation-A-Joy-B-HappyFor.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Distress-B-Shame.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Hope-B-Gratification.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Satisfaction-B-HappyFor.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Dissappointment-B-Pity.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Fear-C-Distress.aml",
  "Anne,Clementine",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Relief-C-Joy.aml",
  "Anne,Clementine",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-FearsConfirmed-C-Anger.aml",
  "Anne,Clementine",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-HappyFor-B-Joy.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Gloating-B-Reproach.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Resentment-C-Gratification.aml",
  "Anne,Clementine",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Pity-B-Distress.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Pride-B-Admiration.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Shame-B-Reproach.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Admiration-B-Pride.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Reproach-C-Pride.aml",
  "Anne,Bruno,Clementine",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Gratitude-B-Pride.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Anger-B-Shame.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Gratification-B-Admiration.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Remorse-B-Reproach.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Liking-B-HappyFor.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Disliking-B-Liking.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Love-B-Pride.aml",
  "Anne,Bruno",
  true,
  false,
  false,
  false,
  true,

  "Evaluation-A-Hate-C-Reproach.aml",
  "Anne,Clementine",
  true,
  false,
  false,
  false,
  true,

  "questionaire_moods.html",
  "Bruno",
  false,
  false,
  false,
  false,
  false,

  "Evaluation-B-Exuberant.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Bored.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Dependent.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Disdainful.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Relaxed.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Anxious.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Docile.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "Evaluation-B-Hostile.aml",
  "Bruno",
  false,
  true,
  true,
  false,
  true,

  "questionaire3.html",
  "",
  false,
  false,
  false,
  false,
  false
);

// internal vars
var current = 0;
var lines   = 0;

/**
 * Play current script and start the progress bar...
 */
function play ()
{
  cancel ();
  hideNextButton ();
  document.affect.play ();
}

/**
 * Highlight the given line with the given index..
 * @param index Index of the line.
 */
function highlight (index)
{
  document.getElementById("dialogline"+index).className = 'active';
}

/**
 * Clear the highlighting.
 */
function clear ()
{
  for (var i = 0; i < lines; ++i)
    document.getElementById("dialogline"+i).className = 'inactive';
}

/**
 * Stop highlighting and cancel script.
 */
function cancel ()
{
  document.affect.cancel ();
  clear ();
}

/**
 * Display the current dialog.
 * This will also make the applet parse the current script.
 */
function display ()
{
  // cancel previous script
  cancel ();

  // display dialog
  var i = 7*current;
  document.affect.setDialog(path+dialogs[i]);
  document.affect.setDisplay(dialogs[i+1], dialogs[i+2], dialogs[i+3], dialogs[i+4], dialogs[i+5], dialogs[i+6]);
  document.getElementById("current").innerHTML = (current+1)+"/"+(dialogs.length/7);
}

/**
 * Switch to previous dialog.
 */
function prev ()
{
  if (current > 0)
  {
    --current;
    display ();
  }
}

/**
 * Switch to next dialog.
 */
function next ()
{
  if (current < dialogs.length/7-1)
  {
    ++current;
    display ();
  }
}

/**
 * Let the applet save the collected data
 */
function saveEvalData ()
{
  document.affect.saveEvaluationData();
}

/**
 * Show play button.
 * @param title Button title.
 */
function showPlayButton (title)
{
  document.getElementById("playButton").innerHTML = "<button onclick=\"play()\">"+title+"</button>";
}

/**
 * Hide play button.
 */
function hidePlayButton ()
{
  document.getElementById("playButton").innerHTML = "";
}

/**
 * Show next button.
 * @param title Button title.
 */
function showNextButton (title)
{
  document.getElementById("nextButton").innerHTML = "<button onclick=\"next()\">"+title+"</button>";
  if ((current >= dialogs.length/7-1)) {
    hideNextButton();
  }
}

/**
 * Hide next button.
 */
function hideNextButton ()
{
  document.getElementById("nextButton").innerHTML = "";
}

/**
 * Set contents of given object in display frame.
 * @param id Object id.
 * @param content HTML content.
 */
function setDisplay (id, content)
{
  var object = top.display.document.getElementById (id);
  object.innerHTML = content;
}

/**
 * Set dialog contents and clear question.
 * @param content HTML content.
 * @param size Amount of highlightable lines.
 */
function setDialog (content, size)
{
  document.getElementById("dialog").innerHTML = content;
  document.getElementById("question").innerHTML = "";
  lines = size;
}

/**
 * Set question content.
 * @param content HTML content.
 */
function setQuestion (content)
{
  document.getElementById("question").innerHTML = content;
}

/**
 * Init dialogs.
 */
function init ()
{
  // set language
  document.affect.setLanguage (language);

  // if there is a dialog show dialog control
  if (dialogs.length)
  {
    // this is no good sign
    if (dialogs.length%7 != 0)
    {
      alert ("Dialog table length must be a multiple of 7.")
      return;
    }

    // prepare dialog control
    // used before to go back in history <button onclick=\"prev()\">&nbsp;&lt;&lt;</button>
    document.getElementById("dialogs").innerHTML = "<table width=\"100%\" height=\"100%\"><tr><td height=\"99%\"><div id=\"dialog\"></div><div id=\"question\"></div></td></tr><tr><td eight=\"1%\"><table width=\"100%\"><tr><td width=\"33%\" align=\"left\"><div id=\"playButton\"><div></td><td width=\"33%\" align=\"center\"><div id=\"current\"></div></td><td width=\"33%\" align=\"right\"><div id=\"nextButton\"><div></td></tr></table></td></tr></table>";

    // show first dialog
    display ();
  }
}

/**
 * Reset display.
 */
function reset ()
{
  current = 0;
  display ();
}
