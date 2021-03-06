import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Scanner;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/* This application was singly developed by Tairi Buchanan.
 * If you make any edits or use extracts from this application,
 * please site it.
 */

public class TurtleGames extends GraphicsProgram 
{
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 3L;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;
	
	public static final AudioClip muzak = Applet.newAudioClip(TurtleGames.class.getResource("Mining by Moonlight.mp3"));
	public static final AudioClip error = Applet.newAudioClip(TurtleGames.class.getResource("UhOh.wav"));
	public static final AudioClip red = Applet.newAudioClip(TurtleGames.class.getResource("Red.wav"));
	public static final AudioClip orange = Applet.newAudioClip(TurtleGames.class.getResource("Orange.wav"));
	public static final AudioClip yellow = Applet.newAudioClip(TurtleGames.class.getResource("Yellow.wav"));
	public static final AudioClip green = Applet.newAudioClip(TurtleGames.class.getResource("Green.wav"));
	public static final AudioClip blue = Applet.newAudioClip(TurtleGames.class.getResource("Blue.wav"));
	public static final AudioClip purple = Applet.newAudioClip(TurtleGames.class.getResource("Purple.wav"));
	public static final AudioClip pink = Applet.newAudioClip(TurtleGames.class.getResource("Pink.wav"));
	public static final AudioClip brown = Applet.newAudioClip(TurtleGames.class.getResource("Brown.wav"));
	public static final AudioClip gray = Applet.newAudioClip(TurtleGames.class.getResource("Grey.wav"));
	public static final AudioClip gameOgre = Applet.newAudioClip(TurtleGames.class.getResource("Game Over.wav"));
	
	
	
	/** Dimensions of the select */
	private static final int selectWidth = 1;
	private static final int selectHeight = 1;
	 
	private static final int basketWidth = 150;
	private static final int basketHeight = 150;
	
	private static final int rektWidth = 100;
	private static final int rektHeight = 100;

	/** Offset of the select up from the bottom */
	private static final int selectYOffset = 30;

	/** Offset of the basket up from the bottom */
	private static final int basketYOffset = 50;
	
	/** The Player's Score */
	private int score = 0;
	
	private int aScore = 0;
	private int bScore = 0;
	private int cScore = 0;
	private int dScore = 0;
	private int eScore = 0;
	private int fScore = 0;
	private int gScore = 0;
	private int hScore = 0;
	
	private int aLapCount = 0;
	private int bLapCount = 0;
	private int cLapCount = 0;
	private int dLapCount = 0;
	private int eLapCount = 0;
	private int fLapCount = 0;
	private int gLapCount = 0;
	private int hLapCount = 0;
	
	private final int rv = 1;
	private final int ts = 1;
	private int lives = 3;
	
	private GLabel drop;
	private GLabel tRace;
	private GLabel trig;
	private GLabel tGames;
	private GLabel match;
	private GLabel playAgain;
	private GLabel mainMenu;
	private GLabel next;
	private GLabel back;
	private GLabel paused;
	
	
	private GLabel oNum;
	private GLabel aNum;
	private GLabel hNum;
	private GLabel Onum;
	private GLabel Anum;
	private GLabel Hnum;
	private GLabel welcome;
	private GLabel obj;
	private GLabel objLine2;
	private GLabel nextObj;
	private GLabel good;
	private GLabel which;
	private GLabel which2;
	private GLabel congrats;
	private GLabel playPractice;
	private GLabel ins;
	private GLabel oops;
	private GLabel ins1;
	private GLabel ins2;
	private GLabel ins3;
	private GLabel ins4;
	private GLabel play;
	private GLabel practice;
	private GLabel copyright;
	private GLabel practiceMode;
	private GLabel fullGame;
	
	private GLabel scoreCount;
	private GLabel livesCount;
	private GLabel loser;
	private GLabel tdrop;
	private GLabel Level1;
	private GLabel Level2;
	private GLabel Level3;
	private GLabel uhOh;
	private GLabel black;
	private GLabel white;
	private GLabel countdown1;
	private GLabel countdown2;
	private GLabel countdown3;
	private GLabel white2;
	private GLabel word;
	
	private GLabel Ascore;
	private GLabel Bscore;
	private GLabel Cscore;
	private GLabel Dscore;
	private GLabel Escore;
	private GLabel Fscore;
	private GLabel Gscore;
	private GLabel Hscore;
	private GLabel ascore;
	private GLabel bscore;
	private GLabel cscore;
	private GLabel dscore;
	private GLabel escore;
	private GLabel fscore;
	private GLabel gscore;
	private GLabel hscore;
	private GLabel restart;
	private GLabel race;
	private GLabel lapCount;
	private GLabel Meter100;
	private GLabel Meter200;
	private GLabel Meter400;
	
	private GLabel tmatch;
	private GLabel enterNames;
	private GLabel player1;
	private GLabel player2;
	private GLabel P2Turn;
	private GLabel P1Turn;
	private GLabel turn;
	private GLabel timeLabel;
	
	
	private GLine opposite1;
	private GLine opposite2;
	private GLine opposite3;
	private GLine opposite4;
	private GLine opposite5;
	private GLine adjacent1;
	private GLine adjacent2;
	private GLine adjacent3;
	private GLine adjacent4;
	private GLine adjacent5;
	private GLine hypotenuse1;
	private GLine hypotenuse2;
	private GLine hypotenuse3;
	private GLine hypotenuse4;
	private GLine hypotenuse5;
	
	private GRect select;
	private GRect oButt;
	private GRect aButt;
	private GRect hButt;
	private GRect game4Button;
	private GRect turtleBase;
	
	private GRect rekt1;
	private GRect rekt2;
	private GRect rekt3;
	private GRect stem;
	private GRect leaf1;
	private GRect leaf2;
	private GRect leaf3;
	private GRect leaf4;
	private GRect leafcover;
	private GRect leafcover2;
	private GRect ground;
	private GRect basket;
	
	private GRect aRectangle;
	private GRect bRectangle;
	private GRect cRectangle;
	private GRect dRectangle;
	private GRect eRectangle;
	private GRect fRectangle;
	private GRect gRectangle;
	private GRect hRectangle;
	private GRect finishLine;
	
	private GRect card;
	private GRect card1;
	private GRect card2;
	private GRect card3;
	private GRect card4;
	private GRect card5;
	private GRect card6;
	private GRect card7;
	private GRect card8;
	private GRect card9;
	private GRect card10;
	private GRect card11;
	private GRect card12;
	private GRect card13;
	private GRect card14;
	private GRect card15;
	private GRect card16;
	private GRect card17;
	private GRect card18;
	private GRect card19;
	private GRect card20;
	
	private GRect card1cover;
	private GRect card2cover;
	private GRect card3cover;
	private GRect card4cover;
	private GRect card5cover;
	private GRect card6cover;
	private GRect card7cover;
	private GRect card8cover;
	private GRect card9cover;
	private GRect card10cover;
	private GRect card11cover;
	private GRect card12cover;
	private GRect card13cover;
	private GRect card14cover;
	private GRect card15cover;
	private GRect card16cover;
	private GRect card17cover;
	private GRect card18cover;
	private GRect card19cover;
	private GRect card20cover;
	
	private GTurtle turtle1;
	private GTurtle turtle2;
	private GTurtle turtle3;
	private GTurtle turtle4;
	private GTurtle turtle5;
	private GTurtle turtle6;
	private GTurtle turtle7;
	private GTurtle turtle8;
	private GTurtle turtle9;
	private GTurtle turtle10;
	private GTurtle turtle11;
	private GTurtle turtle12;
	private GTurtle turtle13;
	private GTurtle turtle14;
	private GTurtle turtle15;
	private GTurtle turtle16;
	private GTurtle turtle17;
	private GTurtle turtle18;
	private GTurtle turtle19;
	private GTurtle turtle20;
	private boolean scoredPoint = false;
	private final boolean numNotGen = true;
	private final boolean searchX = true;
	private boolean Practice = false;
	private boolean mainmenu = false;
	
	private boolean toddlershowcase = false;
	private boolean level1 = false;
	private boolean level2 = false;
	private boolean level3 = false;
	private boolean level4 = false;
	private boolean rekt1gone = false;
	private boolean rekt2gone = false;
	private boolean rekt3gone = false;
	private boolean isLoser = false;
	private boolean redGen = false;
	private boolean orangeGen = false;
	private boolean yellowGen = false;
	private boolean greenGen = false;
	private boolean blueGen = false;
	private boolean purpleGen = false;
	private boolean brownGen = false;
	private boolean grayGen = false;
	private boolean pinkGen = false;
	
	private boolean redChosen = false;
	private boolean orangeChosen = false;
	private boolean yellowChosen = false;
	private boolean greenChosen = false;
	private boolean blueChosen = false;
	private boolean purpleChosen = false;
	private boolean pinkChosen = false;
	private boolean brownChosen = false;
	private boolean blackChosen = false;
	private boolean whiteChosen = false;
	private boolean redMatched = false;
	private boolean orangeMatched = false;
	private boolean yellowMatched = false;
	private boolean greenMatched = false;
	private boolean blueMatched = false;
	private boolean purpleMatched = false;
	private boolean pinkMatched = false;
	private boolean brownMatched = false;
	private boolean blackMatched = false;
	private boolean whiteMatched = false;
	private boolean red2Chosen = false;
	private boolean orange2Chosen = false;
	private boolean yellow2Chosen = false;
	private boolean green2Chosen = false;
	private boolean blue2Chosen = false;
	private boolean purple2Chosen = false;
	private boolean pink2Chosen = false;
	private boolean brown2Chosen = false;
	private boolean black2Chosen = false;
	private boolean white2Chosen = false;
	
	private boolean player1turn = false;
	private boolean player2turn = false;
	
	private boolean meter100 = false;
	private boolean meter200 = false;
	private boolean meter400 = false;
	
	/** He's Back... */
	private GTurtle mrglitch;
	/** And He's Brought Friends...*/
	private GTurtle mrglitch1;
	private GTurtle mrglitch2;
	private GTurtle mrglitch3;
	private GTurtle mrglitch4;
	private GTurtle mrglitch5;
	private GTurtle mrglitch6;
	private GTurtle mrglitch7;
	private GTurtle mrglitch8;
	private GTurtle mrglitch9;
	private GTurtle mrglitch10;
	
	private GTurtle aTurtle;
	private GTurtle bTurtle;
	private GTurtle cTurtle;
	private GTurtle dTurtle;
	private GTurtle eTurtle;
	private GTurtle fTurtle;
	private GTurtle gTurtle;
	private GTurtle hTurtle;
	
	Font Font10 = new Font("Comic Sans", Font.BOLD, 10);
	Font Font15 = new Font("Comic Sans", Font.BOLD, 15);
	Font Font18 = new Font("Comic Sans", Font.BOLD, 18);
	Font Font20 = new Font("Comic Sans", Font.BOLD, 20);
	Font Font25 = new Font("Comic Sans", Font.BOLD, 25);
	Font Font30 = new Font("Comic Sans", Font.BOLD, 30);
	Font Font31 = new Font("Comic Sans", Font.BOLD, 31);
	Font Font35 = new Font("Comic Sans", Font.BOLD, 35);
	Font Font50 = new Font("Comic Sans", Font.BOLD, 50);
	Font Font120 = new Font("Comic Sans", Font.BOLD, 120);
	Font Font240 = new Font("Comic Sans", Font.BOLD, 240);
	
	/** Starting Label */
	private GLabel clickToStart;
	
	/** Generates Colors or Numbers*/ 
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int nextInt = rgen.nextInt(1, 3);
	private int nextSpawn1 = rgen.nextInt(1, 9);
	private int nextSpawn2 = rgen.nextInt(1, 9);
	private int nextSpawn3 = rgen.nextInt(1, 9);
	private int rekt1Spawn = nextSpawn1 * 100;
	private int rekt2Spawn = nextSpawn2 * 100;
	private int rekt3Spawn = nextSpawn3 * 100;
	private int nextColor1 = rgen.nextInt(1, 9);
	private int rectSpeed1 = 0;
	private int rectSpeed2 = 0;
	private int rectSpeed3 = 0;
	private int turtleSpeed1 = rgen.nextInt(1, 9);
	private int turtleSpeed2 = rgen.nextInt(1, 9);
	private int turtleSpeed3 = rgen.nextInt(1, 9);
	private int turtleSpeed4 = rgen.nextInt(1, 9);
	private int turtleSpeed5 = rgen.nextInt(1, 9);
	private int turtleSpeed6 = rgen.nextInt(1, 9);
	private int turtleSpeed7 = rgen.nextInt(1, 9);
	private int turtleSpeed8 = rgen.nextInt(1, 9);

	RandomGenerator rg = new RandomGenerator();
	/** Randomly Generated Color*/
	Color c = rgen.nextColor();
	Color o = new Color(255,0,0);
	Color a = new Color(0,255,0);
	Color h = new Color(0,0,255);
	Color ocean = new Color(9,130,210);
	
	Color Leaf = new Color(50,255,0);
	Color Ground = new Color(100,255,0);
	Color Stem = new Color(160,100,100);
	
	Color Purple = new Color(255,0,255);
	Color Pink = new Color(255,20,147);
	Color Brown = new Color(70,33,33);
	
	Color Lane1 = new Color(180,0,0);
	Color Lane2 = new Color(130, 148, 53);
	Color Lane3 = new Color(240,165,32);
	Color Lane4 = new Color(155,0,200);
	Color Lane5 = new Color(0,55,255);
	Color Lane6 = new Color(255,255,200);
	Color Lane7 = new Color(132,242,125);
	Color Lane8 = new Color(9,130,210);
	
	Color rnd = rgen.nextColor();
	
	private int p1Score = 0;
	private int p2Score = 0;
	
	private int cardRows = 4;
	private int cardColumns = 4;
	private int cardSep = 60;
	private int cardYOffset = 80;
	private int cardWidth = 160;
	private int cardHeight = 160;
	
	public String P1;
	public String P2;
	private int randomName = rgen.nextInt(1, 9);
	
	Scanner user_input = new Scanner( System.in );
	
	
	public static void main(String[] args) 
	{
		new TurtleGames().start();
	}

	public void run()
	{
		addMouseListeners();
		
		if(toddlershowcase)
		{
			turtledrop();
		}		
		addSelect();
		setBackground(Color.black);
		
		tGames = new GLabel("Welcome to Turtle Games. Select a Game to continue.", 25, 500);
		tGames.setFont(Font35);
		tGames.setColor(Color.white);
		
		copyright = new GLabel("© Tairi Inc. All Rights Reserved", 650, 20);
		copyright.setFont(Font20);
		copyright.setColor(Color.white);
		
		trig = new GLabel("Triggy Turtle", 80, 850);
		trig.setFont(Font35);
		trig.setColor(Color.white);
		
		drop = new GLabel("Turtle Drop", 385, 850);
		drop.setFont(Font35);
		drop.setColor(Color.white);
		
		tRace = new GLabel("Turtle Race", 700, 850);
		tRace.setFont(Font35);
		tRace.setColor(Color.white);
		
		match = new GLabel("Turtle Match", 83, 230);
		match.setFont(Font35);
		match.setColor(Color.black);
		
		playAgain = new GLabel("Play Again", 120, 850);
		playAgain.setFont(Font35);
		playAgain.setColor(Color.white);
		
		mainMenu = new GLabel("Main Menu", 700, 850);
		mainMenu.setFont(Font35);
		mainMenu.setColor(Color.white);
		
		paused = new GLabel("Paused", 450, 500);
		paused.setFont(Font35);
		paused.setColor(Color.black);
		
		oButt = new GRect(75,700,250,250);
		oButt.setFilled(true);
		oButt.setFillColor(o);
		
		aButt = new GRect(375,700,250,250);
		aButt.setFilled(true);
		aButt.setFillColor(a);

		hButt = new GRect(675,700,250,250);
		hButt.setFilled(true);
		hButt.setFillColor(h);
		
		game4Button = new GRect(75,100,250,250);
		game4Button.setFilled(true);
		game4Button.setFillColor(Color.yellow);
		
		next = new GLabel("Next", 125, 850);
		next.setFont(Font35);
		next.setColor(Color.white);
		
		back = new GLabel("Back", 725, 850);
		back.setFont(Font35);
		back.setColor(Color.white);
		
		add(tGames);
		add(copyright);
		add(oButt);
		add(aButt);
		add(hButt);
		add(game4Button);
		add(trig);
		add(drop);
		add(tRace);
		add(match);
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				turtlerace();
			}
			if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				turtledrop();
			}
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				triggyturtle();
			}
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 350 && select.getY() >= 100)
			{
				removeAll();
				turtlematch();
			}
		}
	}
	  
	private void triggyturtle()
	{
		muzak.play();
		
		setBackground(Color.black);
		
		mrglitch = new GTurtle(500, 200);
		
		mrglitch1 = new GTurtle(50, 50);
		mrglitch2 = new GTurtle(150, 50);
		mrglitch3 = new GTurtle(250, 50);
		mrglitch4 = new GTurtle(350, 50);
		mrglitch5 = new GTurtle(450, 50);
		mrglitch6 = new GTurtle(550, 50);
		mrglitch7 = new GTurtle(650, 50);
		mrglitch8 = new GTurtle(750, 50);
		mrglitch9 = new GTurtle(850, 50);
		mrglitch10 = new GTurtle(950, 50);
		
		opposite1 = new GLine(205,200,800,200);
		opposite1.setColor(o);
		
		opposite2 = new GLine(205,201,800,201);
		opposite2.setColor(o);
		
		opposite3 = new GLine(205,202,800,202);
		opposite3.setColor(o);
		
		opposite4 = new GLine(205,203,800,203);
		opposite4.setColor(o);
		
		opposite5 = new GLine(205,204,800,204);
		opposite5.setColor(o);
		
		adjacent1 = new GLine(200,200,200,595);
		adjacent1.setColor(a);
		
		adjacent2 = new GLine(201,200,201,595);
		adjacent2.setColor(a);
		
		adjacent3 = new GLine(202,200,202,595);
		adjacent3.setColor(a);
		
		adjacent4 = new GLine(203,200,203,595);
		adjacent4.setColor(a);
		
		adjacent5 = new GLine(204,200,204,595);
		adjacent5.setColor(a);
		
		hypotenuse1 = new GLine(200,596,796,206);
		hypotenuse1.setColor(h);
		
		hypotenuse2 = new GLine(200,597,797,206);
		hypotenuse2.setColor(h);
		
		hypotenuse3 = new GLine(200,598,798,206);
		hypotenuse3.setColor(h);
		
		hypotenuse4 = new GLine(200,599,799,206);
		hypotenuse4.setColor(h);
		
		hypotenuse5 = new GLine(200,600,800,206);
		hypotenuse5.setColor(h);
		
		
		oButt = new GRect(75,700,250,250);
		oButt.setFilled(true);
		oButt.setFillColor(o);
		
		aButt = new GRect(375,700,250,250);
		aButt.setFilled(true);
		aButt.setFillColor(a);

		hButt = new GRect(675,700,250,250);
		hButt.setFilled(true);
		hButt.setFillColor(h);
		
		turtleBase = new GRect(-10,-10, 2000, 110);
		turtleBase.setFilled(true);
		turtleBase.setFillColor(ocean);
		
		welcome = new GLabel("Welcome to Triggy Turtle. Click Instructions or Play.", 25, 500);
		welcome.setFont(Font30);
		welcome.setColor(Color.white);
		
		playPractice = new GLabel("Select Play or Practice to continue.", 25, 500);
		playPractice.setFont(Font35);
		playPractice.setColor(Color.white);
		
		obj = new GLabel("The objective of the game is to press 1, 2 or 3 in a specific order", 20, 500);
		obj.setFont(Font20);
		obj.setColor(Color.white);
		
		objLine2 = new GLabel("depending on the picture that pops up in the middle of the right triangle.", 20, 520);
		objLine2.setFont(Font20);
		objLine2.setColor(Color.white);
		
		nextObj = new GLabel("When you get a point, a turtle will swim to its home and go to the point count.", 20, 500);
		nextObj.setFont(Font20);
		nextObj.setColor(Color.white);
		
		play = new GLabel("Play", 450, 850);
		play.setFont(Font35);
		play.setColor(Color.white);
		
		fullGame = new GLabel("Full Set", 125, 850);
		fullGame.setFont(Font35);
		fullGame.setColor(Color.white);
		
		practice = new GLabel("Practice", 425, 850);
		practice.setFont(Font35);
		practice.setColor(Color.white);
		
		practiceMode = new GLabel("End of Practice Mode. Click to Continue.", 475, 600);
		practiceMode.setFont(Font20);
		practiceMode.setColor(Color.white);
		
		ins = new GLabel("Instructions", 90, 850);
		ins.setFont(Font35);
		ins.setColor(Color.white);
		
		ins1 = new GLabel("When Sine pops up, line up the select with 1 click, then the same with 3", 20, 500);
		ins1.setFont(Font20);
		ins1.setColor(Color.white);
		
		ins2 = new GLabel("When Cosine pop up, line up the select with 2 click, then the same with 3", 20, 500);
		ins2.setFont(Font20);
		ins2.setColor(Color.white);
		
		ins3 = new GLabel("When Tangent pops up, line up the select with 1 click, then the same with 2", 20, 500);
		ins3.setFont(Font20);
		ins3.setColor(Color.white);
		
		ins4 = new GLabel("When you get both numbers, a turtle will swim home and you will get a point.", 20, 500);
		ins4.setFont(Font20);
		ins4.setColor(Color.white);
		
		good = new GLabel("Good Job!", 300, 450);
		good.setFont(Font20);
		good.setColor(Color.white);
		
		oops = new GLabel("Oops! Wrong number, try again!", 300, 450);
		oops.setFont(Font20);
		oops.setColor(Color.white);
		
		congrats = new GLabel("Good Job! Click to Play Again", 475, 600);
		congrats.setFont(Font20);
		congrats.setColor(Color.white);
		
		which = new GLabel("Which number is first?", 300, 250);
		which.setFont(Font20);
		which.setColor(Color.white);
		
		which2 = new GLabel("Which number is next?", 300, 250);
		which2.setFont(Font20);
		which2.setColor(Color.white);
		
		oNum = new GLabel("1", 125, 900);
		oNum.setFont(Font240);
		oNum.setColor(Color.white);
		
		aNum = new GLabel("2", 425, 900);
		aNum.setFont(Font240);
		aNum.setColor(Color.white);
		
		hNum = new GLabel("3", 725, 900);
		hNum.setFont(Font240);
		hNum.setColor(Color.white);
		
		Onum = new GLabel("Sine", 475, 600);
		Onum.setFont(Font120);
		Onum.setColor(Color.white);
		
		Anum = new GLabel("Cosine", 475, 600);
		Anum.setFont(Font120);
		Anum.setColor(Color.white);
		
		Hnum = new GLabel("Tangent", 475, 600);
		Hnum.setFont(Font120);
		Hnum.setColor(Color.white);
		
		clickToStart = new GLabel("Ready? Click to start!", 20, 500);
		clickToStart.setFont(Font20);
		clickToStart.setColor(Color.white);
		
		addSelect();
		add(welcome);
		add(oButt);
		add(aButt);
		add(hButt);
		add(ins);
		add(play);
		add(mainMenu);
		waitForClick();
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				instructions();
			}
			if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
			{
				remove(welcome);
				remove(mrglitch);
				remove(ins);
				remove(play);
				remove(mainMenu);
				add(fullGame);
				add(practice);
				add(back);
				waitForClick();
				while(searchX)
				{
				if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
				{
					setup();
				}
				if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
				{
					practice();
				}
				if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
				{
					removeAll();
					triggyturtle();
				}
				}
			}
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				mainmenu();
			}		
		}
	}		
	
	private void turtledrop()
	{
		
		scoreCount = new GLabel("Score: " + score, 10, 40); 
		scoreCount.setFont(Font35);
		scoreCount.setColor(Color.black);
		
		livesCount = new GLabel("Lives: " + lives, 800, 40);
		livesCount.setFont(Font35);
		livesCount.setColor(Color.black);
		
		tdrop = new GLabel("Welcome to Turtle Drop", 350, 500);
		tdrop.setFont(Font35);
		tdrop.setColor(Color.white);
		
		lapCount = new GLabel("Select a Level", 400, 500);
		lapCount.setFont(Font35);
		lapCount.setColor(Color.white);
		
		paused = new GLabel("Paused", 450, 500);
		paused.setFont(Font35);
		
		loser = new GLabel("You Lose :(", 400, 500);
		loser.setFont(Font35);
		loser.setColor(Color.white);
		
		uhOh = new GLabel("Uh Oh! Try not to touch the black and white boxes.", 200, 500);
		uhOh.setFont(Font20);
		
		Level1 = new GLabel("Level 1", 150, 850);
		Level1.setFont(Font30);
		Level1.setColor(Color.white);
		
		Level2 = new GLabel("Level 2", 450, 850);
		Level2.setFont(Font30);
		Level2.setColor(Color.white);
		
		Level3 = new GLabel("Level 3", 750, 850);
		Level3.setFont(Font30);
		Level3.setColor(Color.white);
		
		rekt1 = new GRect(nextSpawn1 * 100, 0, rektWidth, rektHeight);
		rekt1.setFilled(true);
		
		rekt2 = new GRect(nextSpawn2 * 100, 0, rektWidth, rektHeight);
		rekt2.setFilled(true);
		rekt2.setFillColor(Color.black);
		
		rekt3 = new GRect(nextSpawn3 * 100, 0, rektWidth, rektHeight);
		rekt3.setFilled(true);
		rekt3.setFillColor(Color.white);
		
		black = new GLabel("BLACK", rekt2Spawn, rektWidth / 2);
		black.setFont(Font30);
		black.setColor(Color.white);
		
		white = new GLabel("WHITE", rekt3Spawn, rektWidth / 2);
		white.setFont(Font30);
		
		white2 = new GLabel("WHITE", rekt3Spawn, rektWidth / 2);
		white2.setFont(Font31);
		
		word = new GLabel("", rekt1Spawn, rektWidth / 2);
		word.setFont(Font25);
		word.setColor(Color.black);
		
		play = new GLabel("Play", 150, 850);
		play.setFont(Font35);
		play.setColor(Color.white);
		
		basket = new GRect(basketWidth, 1000 - basketHeight - basketYOffset, basketWidth, basketHeight);
		basket.setFilled(true);
		
		addSelect();
		
		if(level2)
		{
			removeAll();
			addNewRekts();
			countdown();
			dropdown2();
		}
		if(level3)
		{
			removeAll();
			addNewRekts();
			countdown();
			dropdown3();
		}
		if(level4)
		{
			removeAll();
			addNewRekts();
			countdown();
			dropdown3();
		}
		if(toddlershowcase)
		{
			level1 = true;
			removeAll();
			addNewRekts();
			countdown();
			dropdown();
		}
		add(tdrop);
		add(oButt);
		add(hButt);
		add(play);
		add(mainMenu);
		
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				add(lapCount);
				remove(tdrop);
				remove(play);
				remove(mainMenu);
				add(aButt);
				add(Level1);
				add(Level2);
				add(Level3);
				
				while(searchX)
				{
					waitForClick();
					if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
					{
						level1 = true;
						removeAll();
						addNewRekts();
						countdown();
						dropdown();
					}
					if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
					{
						level2 = true;
						removeAll();
						addNewRekts();
						countdown();
						dropdown2();
					}
					if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
					{
						level3 = true;
						removeAll();
						addNewRekts();
						countdown();
						dropdown3();
					}
				}
			}
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				mainmenu();
			}
		}
		
	}
	
	private void turtlerace()
	{
		meter100 = false;
		meter200 = false;
		meter400 = false;
	
		rnd = rgen.nextColor();
		setBackground(Color.black);
		System.out.println(rnd);
		
		Ascore = new GLabel("" + aLapCount, 10, 50);
		Bscore = new GLabel("" + bLapCount, 10, 150);
		Cscore = new GLabel("" + cLapCount, 10, 250);
		Dscore = new GLabel("" + dLapCount, 10, 350);
		Escore = new GLabel("" + eLapCount, 10, 450);
		Fscore = new GLabel("" + fLapCount, 10, 550);
		Gscore = new GLabel("" + gLapCount, 10, 650);
		Hscore = new GLabel("" + hLapCount, 10, 750);
		
		restart = new GLabel("Reset Score", 380, 850);
		
		play = new GLabel("Play", 150, 850);
		play.setFont(Font35);
		play.setColor(Color.white);
		
		lapCount = new GLabel("Select Lap Count", 400, 500);
		lapCount.setFont(Font35);
		lapCount.setColor(Color.white);
		
		race = new GLabel("Welcome to Turtle Race. Select a Play to continue.", 25, 500);
		race.setFont(Font35);
		race.setColor(Color.white);
		
		ascore = new GLabel("Red Ned's Lap Count =" + aLapCount, 10, 50);
		bscore = new GLabel("Baby Barf's Lap Count =" + bLapCount, 10, 100);
		cscore = new GLabel("Orange's Lap Count =" + cLapCount, 10, 150);
		dscore = new GLabel("Purple Nurple's Lap Count =" + dLapCount, 10, 200);
		escore = new GLabel("Blue Sue's Lap Count =" + eLapCount, 10, 250);
		fscore = new GLabel("Sandy Randy's Lap Count =" + fLapCount, 10, 300);
		gscore = new GLabel("Mint Jun's Lap Count =" + gLapCount, 10, 350);
		hscore = new GLabel("Random's Lap Count =" + hLapCount, 10, 400);
		
		Meter100 = new GLabel("100 Meter Race", 80, 850);
		Meter100.setFont(Font30);
		Meter100.setColor(Color.white);
		
		Meter200 = new GLabel("200 Meter Race", 385, 850);
		Meter200.setFont(Font30);
		Meter200.setColor(Color.white);
		
		Meter400 = new GLabel("400 Meter Race", 685, 850);
		Meter400.setFont(Font30);
		Meter400.setColor(Color.white);
		
		Ascore.setFont(Font35);
		Bscore.setFont(Font35);
		Cscore.setFont(Font35);
		Dscore.setFont(Font35);
		Escore.setFont(Font35);
		Fscore.setFont(Font35);
		Gscore.setFont(Font35);
		Hscore.setFont(Font35);
		ascore.setFont(Font35);
		bscore.setFont(Font35);
		cscore.setFont(Font35);
		dscore.setFont(Font35);
		escore.setFont(Font35);
		fscore.setFont(Font35);
		gscore.setFont(Font35);
		hscore.setFont(Font35);
		restart.setFont(Font35);
		
		Ascore.setColor(Color.black);
		Bscore.setColor(Color.black);
		Cscore.setColor(Color.black);
		Dscore.setColor(Color.black);
		Escore.setColor(Color.black);
		Fscore.setColor(Color.black);
		Gscore.setColor(Color.black);
		Hscore.setColor(Color.black);
		ascore.setColor(Color.white);
		bscore.setColor(Color.white);
		cscore.setColor(Color.white);
		dscore.setColor(Color.white);
		escore.setColor(Color.white);
		fscore.setColor(Color.white);
		gscore.setColor(Color.white);
		hscore.setColor(Color.white);
		restart.setColor(Color.white);
		
		aRectangle = new GRect(0,0,1000,100);
		aRectangle.setFilled(true);
		aRectangle.setFillColor(Lane1);
		
		bRectangle = new GRect(0,100,1000,100);
		bRectangle.setFilled(true);
		bRectangle.setFillColor(Lane2);
		
		cRectangle = new GRect(0,200,1000,100);
		cRectangle.setFilled(true);
		cRectangle.setFillColor(Lane3);
		
		dRectangle = new GRect(0,300,1000,100);
		dRectangle.setFilled(true);
		dRectangle.setFillColor(Lane4);
		
		eRectangle = new GRect(0,400,1000,100);
		eRectangle.setFilled(true);
		eRectangle.setFillColor(Lane5);
		
		fRectangle = new GRect(0,500,1000,100);
		fRectangle.setFilled(true);
		fRectangle.setFillColor(Lane6);
		
		gRectangle = new GRect(0,600,1000,100);
		gRectangle.setFilled(true);
		gRectangle.setFillColor(Lane7);
		
		hRectangle = new GRect(0,700,1000,100);
		hRectangle.setFilled(true);
		hRectangle.setFillColor(rnd);
		
		finishLine = new GRect(950,0,20,1000);
		finishLine.setFilled(true);
		finishLine.setFillColor(Color.white);
		
		aTurtle = new GTurtle(50,50);
		
		bTurtle = new GTurtle(50,150);
		
		cTurtle = new GTurtle(50,250);
		
		dTurtle = new GTurtle(50,350);
		
		eTurtle = new GTurtle(50,450);
		
		fTurtle = new GTurtle(50,550);
		
		gTurtle = new GTurtle(50,650);
		
		hTurtle = new GTurtle(50,750);
		
		addSelect();
		add(race);
		add(oButt);
		add(hButt);
		add(play);
		add(mainMenu);
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				remove(play);
				remove(mainMenu);
				remove(race);
				add(aButt);
				add(lapCount);
				add(Meter100);
				add(Meter200);
				add(Meter400);
				while(searchX)
				{
					waitForClick();
					if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
					{
						removeAll();
						meter100 = true;
						warmUp();
						
					}
					if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
					{
						removeAll();
						meter200 = true;
						warmUp();
					}
					if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
					{
						removeAll();
						meter400 = true;
						warmUp();
					}
				}
			}
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				mainmenu();
			}	
		}
	}
	
	private void turtlematch()
	{
		
		tmatch = new GLabel("Welcome to Turtle Match", 350, 500);
		tmatch.setFont(Font35);
		tmatch.setColor(Color.white);
		
		play = new GLabel("Play", 150, 850);
		play.setFont(Font35);
		play.setColor(Color.white);
		
		mainMenu = new GLabel("Main Menu", 700, 850);
		mainMenu.setFont(Font35);
		mainMenu.setColor(Color.white);
		
		add(tmatch);
		add(oButt);
		add(hButt);
		add(play);
		add(mainMenu);
		
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				names();
			}	
				
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				mainmenu();
			}
		}
	}
	
	private void instructions()
	{
		add(obj);
		add(objLine2);
		waitForClick();
		remove(obj);
		remove(objLine2);
		
		add(ins1);
		add(oButt);
		add(oNum);
		add(hButt);
		add(hNum);
		waitForClick();
		remove(ins1);
		remove(oButt);
		remove(oNum);
		remove(hButt);
		remove(hNum);
		
		add(ins2);
		add(aButt);
		add(aNum);
		add(hButt);
		add(hNum);
		waitForClick();
		remove(ins2);
		remove(aButt);
		remove(aNum);
		remove(hButt);
		remove(hNum);
		
		add(ins3);
		add(oButt);
		add(oNum);
		add(aButt);
		add(aNum);
		waitForClick();
		remove(ins3);
		remove(oButt);
		remove(oNum);
		remove(aButt);
		remove(aNum);
		
		add(ins4);
		add(turtleBase);
		add(mrglitch);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		remove(mrglitch);
		add(mrglitch1);
		waitForClick();
		removeAll();
		triggyturtle();
	}
	
	private void practice()
	{
		Practice = true;
		
		Onum = new GLabel("Sine (1 then 3)", 475, 600);
		Onum.setFont(Font20);
		Onum.setColor(Color.white);
		
		Anum = new GLabel("Cosine (2 then 3)", 475, 600);
		Anum.setFont(Font20);
		Anum.setColor(Color.white);
		
		Hnum = new GLabel("Tangent (1 then 2)", 475, 600);
		Hnum.setFont(Font20);
		Hnum.setColor(Color.white);
		
		setup();
	}
	
	private void gameplay()
	{
		while(true)
		{
			if(Practice && score == 0)
			{
				add(Onum);
				sine();
			}
			if(Practice && score == 1)
			{
				add(Anum);
				cosine();
			}
			if(Practice && score == 2)
			{
				add(Hnum);
				tangent();
			}
			if(numNotGen)
			{
				nextInt = rgen.nextInt(1, 3);
				
				if(scoredPoint == false)
				{
					
					if(nextInt == 1)
					{
						System.out.println("Sine Generated");
						add(Onum);
						sine();	
					}
					
					if(nextInt == 2)
					{
						System.out.println("Cosine Generated");
						add(Anum);
						cosine();
						
					}
					
					if(nextInt == 3)
					{
						System.out.println("Tangent Generated");
						add(Hnum);
						tangent();
					}
				}
			}
		}
	}

	private void setup()
	{
		removeAll();
		addSelect();
		
		add(clickToStart);
		waitForClick();
		remove(clickToStart);
		
		add(turtleBase);
		add(oButt);
		add(aButt);
		add(hButt);
		add(oNum);
		add(aNum);
		add(hNum);
		
		add(opposite1);
		add(opposite2);
		add(opposite3);
		add(opposite4);
		add(opposite5);
	
		
		add(adjacent1);
		add(adjacent2);
		add(adjacent3);
		add(adjacent4);
		add(adjacent5);
		
		add(hypotenuse1);
		add(hypotenuse2);
		add(hypotenuse3);
		add(hypotenuse4);
		add(hypotenuse5);
		
		gameplay();
	}
	
	private void sine()
	{
		while(searchX)
		{
			select.getX();
			System.out.println(select.getX());
			add(which);
			waitForClick();
			select.getX();
			System.out.println(select.getX());
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				System.out.println(select.getX());
				add(good);
				pause(1000);
				remove(good);
				remove(which);
				sine2();	
			}
			if(select.getX() < 75 && select.getX() > 325)
			{
				add(oops);
				pause(1000);
				remove(oops);
				sine();
			}		
		}
	}
	
	private void sine2()
	{
		while(searchX)
		{
			select.getX();
			System.out.println(select.getX());
			add(which2);
			waitForClick();
			select.getX();
			System.out.println(select.getX());
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				add(good);
				pause(1000);
				remove(good);
				remove(Onum);
				remove(which2);
				score();
			}
				
			if(select.getX() < 675 && select.getX() > 925)
			{
				add(oops);
				pause(1000);
				remove(oops);
				sine2();
			}
		}
	}
	
	private void cosine()
	{
		while(searchX)
		{
			select.getX();
			System.out.println(select.getX());
			add(which);
			waitForClick();
			select.getX();
			System.out.println(select.getX());
			if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
			{
				System.out.println(select.getX());
				add(good);
				pause(1000);
				remove(good);
				remove(which);
				cosine2();	
			}
			if(select.getX() < 375 && select.getX() > 625)
			{
				add(oops);
				pause(1000);
				remove(oops);
				cosine();
			}	
		}
	}
	
	private void cosine2()
	{
		while(searchX)
		{
			select.getX();
			System.out.println(select.getX());
			add(which2);
			waitForClick();
			select.getX();
			System.out.println(select.getX());
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				add(good);
				pause(1000);
				remove(good);
				remove(Anum);
				remove(which2);
				score();
			}
			
			if(select.getX() < 675 && select.getX() > 925)
			{
				add(oops);
				pause(1000);
				remove(oops);
				cosine2();
			}
		}
	}
	
	private void tangent()
	{
		while(searchX)
		{
			select.getX();
			System.out.println(select.getX());
			add(which);
			waitForClick();
			select.getX();
			System.out.println(select.getX());
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				System.out.println(select.getX());
				add(good);
				pause(1000);
				remove(good);
				remove(which);
				tangent2();	
			}
			if(select.getX() < 75 && select.getX() > 325)
			{
				add(oops);
				pause(1000);
				remove(oops);
				tangent();
			}
		}
	}
	
	private void tangent2()
	{
		while(searchX)
		{
			select.getX();
			System.out.println(select.getX());
			add(which2);
			waitForClick();
			select.getX();
			System.out.println(select.getX());
			if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
			{
				add(good);
				pause(1000);
				remove(good);
				remove(Hnum);
				remove(which2);
				score();
			}
			
			if(select.getX() < 375 && select.getX() > 625)
			{
				add(oops);
				pause(1000);
				remove(oops);
				tangent2();
			}	
		}
	}
	
	private void score()
	{	
		//This is so Mr. Glitch's position is reset.
		mrglitch = new GTurtle(500, 150);
		
		add(mrglitch);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		mrglitch.move(0, -10);
		
		if(score == 0)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch1);
			gameplay();
		}
		
		if(score == 1)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch2);
			gameplay();
		}
		if(score == 2)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch3);
			if(Practice)
			{
				add(practiceMode);
				Practice = false;
				waitForClick();
				removeAll();
				score = 0;
				triggyturtle();
			}
			gameplay();
		}
		if(score == 3)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch4);
			gameplay();
		}
		if(score == 4)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch5);
			gameplay();
		}
		if(score == 5)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch6);
			gameplay();
		}
		if(score == 6)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch7);
			gameplay();
		}
		if(score == 7)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch8);
			gameplay();
		}
		if(score == 8)
		{
			remove(mrglitch);
			score += 1;
			add(mrglitch9);
			gameplay();
		}
		if(score == 9)
		{
			remove(mrglitch);
			score = 0;
			add(mrglitch10);
			add(congrats);
			waitForClick();
			removeAll();
			triggyturtle();
		}
	}
	
	private void dropdown()
	{
		
		while(searchX)
		{
			add(scoreCount);
			add(livesCount);
			
			if(score == 10)
			{
				redGen = false;
				orangeGen = false;
				yellowGen = false;
				greenGen = false;
				blueGen = false;
				purpleGen = false;
				brownGen = false;
				grayGen = false;
				pinkGen = false;
				removeAll();
				level1 = false;
				level2 = true;
				score = 0;
				if(toddlershowcase)
				{
					removeAll();
					addNewRekts();
					countdown();
					dropdown2();
				}
				ending();
			}
			if(rekt1gone == true && rekt2gone == true && rekt3gone == true)
			{
				rekt1gone = false;
				rekt2gone = false;
				rekt3gone = false;
				removeAll();
				addNewRekts();
				dropdown();
			}
			
				rekt1.move(0, rv * rectSpeed1);
			
				rekt2.move(0, rv * rectSpeed2);
				
				rekt3.move(0, rv * rectSpeed3);
				
			
			pause(15);
			
			if(rekt1.getX() <= basket.getX() + 150 && rekt1.getX() >= basket.getX() - 99 && rekt1.getY() >= 800 && rekt1.getY() <= 1050)
			{
				rekt1gone = true;
				score += 1;
				System.out.println("Score : " + score);
				scoreCount.setLabel("Score: " + score);
				if(redGen)
				{
					red.play();
				}
				if(orangeGen)
				{
					orange.play();
				}
				if(yellowGen)
				{
					yellow.play();
				}
				if(greenGen)
				{
					green.play();
				}
				if(blueGen)
				{
					blue.play();
				}
				if(purpleGen)
				{
					purple.play();
				}
				if(brownGen)
				{
					brown.play();
				}
				if(grayGen)
				{
					gray.play();
				}
				if(pinkGen)
				{
					pink.play();
				}
				removeAll();
				addNewRekts();
				dropdown();
			}
			if(rekt2.getX() <= basket.getX() + 150 && rekt2.getX() >= basket.getX() - 99 && rekt2.getY() >= 800 && rekt2.getY() <= 1050)
			{
				rekt2gone = true;
				lives -= 1;
				livesCount.setLabel("Lives: " + lives);
				System.out.println("Lives : " + lives);
				error.play();
				if(lives == 0)
				{
					pause(1000);
					gameOgre.play();
					pause(3000);
					score = 0;
					lives = 3;
					turtledrop();
				}
				add(uhOh);
				pause(2000);
				remove(uhOh);
				removeAll();
				addNewRekts();
				countdown();
				dropdown();
			}
			if(rekt3.getX() <= basket.getX() + 150 && rekt3.getX() >= basket.getX() - 99 && rekt3.getY() >= 800 && rekt3.getY() <= 1050)
			{
				rekt3gone = true;
				lives -= 1;
				livesCount.setLabel("Lives: " + lives);
				System.out.println("Lives : " + lives);
				error.play();
				if(lives == 0)
				{
					pause(1000);
					gameOgre.play();
					pause(3000);
					score = 0;
					lives = 3;
					turtledrop();
				}
				add(uhOh);
				pause(2000);
				remove(uhOh);
				removeAll();
				addNewRekts();
				countdown();
				dropdown();
			}
			if(rekt1.getY() >= 1000)
			{
				removeAll();
				rekt1gone = true;
				addNewRekts();
				dropdown();
			}
			if(rekt2.getY() >= 1000)
			{
				remove(rekt2);
				rekt2gone = true;
			}
			if(rekt3.getY() >= 1000)
			{
				remove(rekt3);
				rekt3gone = true;
			}
			scoreCount.setLabel("Score: " + score);
		}
	}
	
	private void dropdown2()
	{
		while(searchX)
		{
			scoreCount.setLabel("Score: " + score);
			add(scoreCount);
			add(livesCount);
			
			
			if(score == 10)
			{
				redGen = false;
				orangeGen = false;
				yellowGen = false;
				greenGen = false;
				blueGen = false;
				purpleGen = false;
				brownGen = false;
				grayGen = false;
				pinkGen = false;
				removeAll();
				level2 = false;
				level3 = true;
				score = 0;
				if(toddlershowcase)
				{
					removeAll();
					addNewRekts();
					countdown();
					dropdown3();
				}
				ending();
			}
			
			if(rekt1gone == true && rekt2gone == true && rekt3gone == true)
			{
				rekt1gone = false;
				rekt2gone = false;
				rekt3gone = false;
				addNewRekts();
				dropdown2();
			}
			
				rekt1.move(0, rv * rectSpeed1);
				word.move(0, rv * rectSpeed1);
			
				rekt2.move(0, rv * rectSpeed2);
				black.move(0, rv * rectSpeed2);
	
				rekt3.move(0, rv * rectSpeed3);
				white.move(0, rv * rectSpeed3);
			
			pause(15);
			
			if(rekt1.getX() <= basket.getX() + 150 && rekt1.getX() >= basket.getX() - 99 && rekt1.getY() >= 800 && rekt1.getY() <= 1050)
			{
				rekt1gone = true;
				score += 1;
				scoreCount.setLabel("Score: " + score);
				System.out.println("Score : " + score);
				if(redGen)
				{
					red.play();
				}
				if(orangeGen)
				{
					orange.play();
				}
				if(yellowGen)
				{
					yellow.play();
				}
				if(greenGen)
				{
					green.play();
				}
				if(blueGen)
				{
					blue.play();
				}
				if(purpleGen)
				{
					purple.play();
				}
				if(brownGen)
				{
					brown.play();
				}
				if(grayGen)
				{
					gray.play();
				}
				if(pinkGen)
				{
					pink.play();
				}
				removeAll();
				addNewRekts();
				dropdown2();
			}
			if(rekt2.getX() <= basket.getX() + 150 && rekt2.getX() >= basket.getX() - 99 && rekt2.getY() >= 800 && rekt2.getY() <= 1050)
			{
				rekt2gone = true;
				lives -= 1;
				livesCount.setLabel("Lives: " + lives);
				System.out.println("Lives : " + lives);
				error.play();
				if(lives == 0)
				{
					pause(1000);
					gameOgre.play();
					pause(3000);
					score = 0;
					lives = 3;
					turtledrop();
				}
				add(uhOh);
				pause(2000);
				remove(uhOh);
				removeAll();
				addNewRekts();
				countdown();
				dropdown2();
			}
			if(rekt3.getX() <= basket.getX() + 150 && rekt3.getX() >= basket.getX() - 99 && rekt3.getY() >= 800 && rekt3.getY() <= 1050)
			{
				rekt3gone = true;
				lives -= 1;
				livesCount.setLabel("Lives: " + lives);
				System.out.println("Lives : " + lives);
				error.play();
				if(lives == 0)
				{
					pause(1000);
					gameOgre.play();
					pause(3000);
					score = 0;
					lives = 3;
					turtledrop();
				}
				add(uhOh);
				pause(2000);
				remove(uhOh);
				removeAll();
				addNewRekts();
				countdown();
				dropdown2();
			}
			if(rekt1.getY() >= 1000)
			{
				removeAll();
				rekt1gone = true;
				addNewRekts();
				dropdown2();
			}
			if(rekt2.getY() >= 1000)
			{
				remove(rekt2);
				remove(black);
				rekt2gone = true;
			}
			if(rekt3.getY() >= 1000)
			{
				remove(rekt3);
				remove(white);
				rekt3gone = true;
			}
			
			remove(scoreCount);
		}
	}
	
	private void dropdown3()
	{
		while(searchX)
		{
			scoreCount.setLabel("Score: " + score);
			add(scoreCount);
			add(livesCount);
			
			if(score == 10)
			{
				redGen = false;
				orangeGen = false;
				yellowGen = false;
				greenGen = false;
				blueGen = false;
				purpleGen = false;
				brownGen = false;
				grayGen = false;
				pinkGen = false;
				score = 0;
				if(level4)
				{
					level4 = false;
					level1 = true;
					turtledrop();
				}
				level3 = false;
				level4 = true;
				if(toddlershowcase)
				{
					removeAll();
					addNewRekts();
					countdown();
					dropdown3();
				}
				removeAll();
				ending();
				
			}
			
			if(rekt1gone == true && rekt2gone == true && rekt3gone == true)
			{
				rekt1gone = false;
				rekt2gone = false;
				rekt3gone = false;
				mainmenu();
			}
			
				word.move(0, rv * rectSpeed1);
				black.move(0, rv * rectSpeed2);
				white.move(0, rv * rectSpeed3);
		
			
			pause(15);
			
			if(word.getX() <= basket.getX() + 150 && word.getX() >= basket.getX() - 99 && word.getY() >= 800 && word.getY() <= 1050)
			{
				rekt1gone = true;
				score += 1;
				scoreCount.setLabel("Score: " + score);
				System.out.println("Score : " + score);
				if(redGen)
				{
					red.play();
				}
				if(orangeGen)
				{
					orange.play();
				}
				if(yellowGen)
				{
					yellow.play();
				}
				if(greenGen)
				{
					green.play();
				}
				if(blueGen)
				{
					blue.play();
				}
				if(purpleGen)
				{
					purple.play();
				}
				if(brownGen)
				{
					brown.play();
				}
				if(grayGen)
				{
					gray.play();
				}
				if(pinkGen)
				{
					pink.play();
				}
				removeAll();
				addNewRekts();
				dropdown3();
			}
			if(black.getX() <= basket.getX() + 150 && black.getX() >= basket.getX() - 99 && black.getY() >= 800 && black.getY() <= 1050)
			{
				rekt2gone = true;
				lives -= 1;
				livesCount.setLabel("Lives: " + lives);
				System.out.println("Lives : " + lives);
				error.play();
				if(lives == 0)
				{
					pause(1000);
					gameOgre.play();
					pause(3000);
					score = 0;
					lives = 3;
					turtledrop();
				}
				add(uhOh);
				pause(2000);
				remove(uhOh);				
				removeAll();
				addNewRekts();
				countdown();
				dropdown3();
			}
			if(white.getX() <= basket.getX() + 150 && white.getX() >= basket.getX() - 99 && white.getY() >= 800 && white.getY() <= 1050)
			{
				rekt3gone = true;
				lives -= 1;
				livesCount.setLabel("Lives: " + lives);
				System.out.println("Lives : " + lives);
				error.play();
				if(lives == 0)
				{
					pause(1000);
					gameOgre.play();
					pause(3000);
					score = 0;
					lives = 3;
					turtledrop();
				}
				add(uhOh);
				pause(2000);
				remove(uhOh);
				removeAll();
				addNewRekts();
				countdown();
				dropdown3();
			}
			if(word.getY() >= 1200)
			{
				removeAll();
				rekt1gone = true;
				addNewRekts();
				dropdown3();
			}
			if(black.getY() >= 1200)
			{
				remove(black);
				rekt2gone = true;
			}
			if(white.getY() >= 1200)
			{
				remove(white);
				remove(white2);
				rekt3gone = true;
			}
			
			remove(scoreCount);
		}
	}
	
	private void addNewRekts()
	{
		
		removeAll();
		
		addBackground();
		
		redGen = false;
		orangeGen = false;
		yellowGen = false;
		greenGen = false;
		blueGen = false;
		purpleGen = false;
		brownGen = false;
		grayGen = false;
		pinkGen = false;
		
		rekt1gone = false;
		rekt2gone = false;
		rekt3gone = false;
		
		rectSpeed1 = rgen.nextInt(3, 5);
		rectSpeed2 = rgen.nextInt(3, 5);
		while(rectSpeed2 == rectSpeed1)
		{
			rectSpeed2 = rgen.nextInt(3, 5);
		}
		rectSpeed3 = rgen.nextInt(3, 5);
		while(rectSpeed2 == rectSpeed3 || rectSpeed3 == rectSpeed1)
		{
			rectSpeed3 = rgen.nextInt(3, 5);
		}
		nextSpawn1 = rgen.nextInt(1, 9);
		
		rekt1Spawn = nextSpawn1 * 100;
		
		System.out.println("Next Spawn 1 : " + nextSpawn1);
		rekt1 = new GRect(nextSpawn1 * 100, 0, rektWidth, rektHeight);
		rekt1.setFilled(true);
		
		word = new GLabel("", rekt1Spawn, rektWidth / 2);
		word.setFont(Font25);
		word.setColor(Color.white);
		if(level1 || level2)
		{
			add(rekt1);	
		}
		rekt1.setFilled(true);
		
		nextColor();
		
		nextSpawn2 = rgen.nextInt(1, 9);
		while(nextSpawn2 == nextSpawn1 - 1 ||nextSpawn2 == nextSpawn1 + 1 || nextSpawn2 == nextSpawn1)
		{
			nextSpawn2 = rgen.nextInt(1, 9);
		}
		rekt2 = new GRect(nextSpawn2 * 100, 0, rektWidth, rektHeight);
		rekt2.setFilled(true);
		rekt2.setFillColor(Color.black);
	
		System.out.println("Next Spawn 2 : " + nextSpawn2);
		rekt2Spawn = nextSpawn2 * 100;
		
		black = new GLabel("BLACK", rekt2Spawn, rektWidth / 2);
		black.setFont(Font30);
		
		if(level1 || level2)
		{
			add(rekt2);	
			black.setColor(Color.white);
		}
		if(level3 || level2 || level4)
		{
			add(black);
			if(level3)
			{
				black.setColor(Color.black);
			}
		}
		
		nextSpawn3 = rgen.nextInt(1, 9);
		while(nextSpawn3 == nextSpawn1 + 1 || nextSpawn3 == nextSpawn2 + 1 || nextSpawn3 == nextSpawn1 || nextSpawn3 == nextSpawn2 || nextSpawn3 == nextSpawn1 - 1 || nextSpawn3 == nextSpawn2 - 1)
		{
			nextSpawn3 = rgen.nextInt(1, 9);
		}
		rekt3 = new GRect(nextSpawn3 * 100, 0, rektWidth, rektHeight);
		rekt3.setFilled(true);
		rekt3.setFillColor(Color.white);
		System.out.println("Next Spawn 3 : " + nextSpawn3);
		rekt3Spawn = nextSpawn3 * 100;
		
		white = new GLabel("WHITE", rekt3Spawn, rektWidth / 2);
		white.setFont(Font30);
		
		if(level1 || level2)
		{
			add(rekt3);	
		}
		if(level3 || level2 || level4)
		{
			if(level3)
			{
				white.setColor(Color.white);
			}
			add(white);	
		}
		
		add(basket);
	}
	
	private void ending()
	{
		score = 0;
		if(isLoser)
		{
			lives = 3;
			add(loser);
		}
		setBackground(Color.black);
		add(select);
		add(oButt);
		add(aButt);
		add(hButt);
		add(play);
		
		drop.setLabel("Select a Level");
		
		add(drop);
		add(mainMenu);
		
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				
				removeAll();
				if(level1)
				{
					addNewRekts();
					dropdown();
				}
				turtledrop();
			}
			if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
			{
				level1 = false;
				level2 = false;
				level3 = false;
				removeAll();
				turtledrop();
			}
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				mainmenu();
			}
		}
	}
	
 	private void warmUp()
	{
 		turtleSpeed1 = rgen.nextInt(1, 9);
 		turtleSpeed2 = rgen.nextInt(1, 9);
 		turtleSpeed3 = rgen.nextInt(1, 9);
 		turtleSpeed4 = rgen.nextInt(1, 9);
 		turtleSpeed5 = rgen.nextInt(1, 9);
 		turtleSpeed6 = rgen.nextInt(1, 9);
 		turtleSpeed7 = rgen.nextInt(1, 9);
 		turtleSpeed8 = rgen.nextInt(1, 9);
 		
 		aTurtle = new GTurtle(50,50);
		
		bTurtle = new GTurtle(50,150);
		
		cTurtle = new GTurtle(50,250);
		
		dTurtle = new GTurtle(50,350);
		
		eTurtle = new GTurtle(50,450);
		
		fTurtle = new GTurtle(50,550);
		
		gTurtle = new GTurtle(50,650);
		
		hTurtle = new GTurtle(50,750);
 		
		add(aRectangle);
		add(bRectangle);
		add(cRectangle);
		add(dRectangle);
		add(eRectangle);
		add(fRectangle);
		add(gRectangle);
		add(hRectangle);
		if(meter100)
		{
			add(finishLine);
		}
		add(Ascore);
		add(Bscore);
		add(Cscore);
		add(Dscore);
		add(Escore);
		add(Fscore);
		add(Gscore);
		add(Hscore);
		add(aTurtle);
		add(bTurtle);
		add(cTurtle);
		add(dTurtle);
		add(eTurtle);
		add(fTurtle);
		add(gTurtle);
		add(hTurtle);
		
		if(meter100);
		{
			meter100();
		}
		if(meter200);
		{
			meter200();
		}
		if(meter400);
		{
			meter400();
		}
	}
	
	private void meter100()
	{	
		while(searchX)
		{
			
			turtleSpeed1 = rgen.nextInt(1, 9);
	 		turtleSpeed2 = rgen.nextInt(1, 9);
	 		turtleSpeed3 = rgen.nextInt(1, 9);
	 		turtleSpeed4 = rgen.nextInt(1, 9);
	 		turtleSpeed5 = rgen.nextInt(1, 9);
	 		turtleSpeed6 = rgen.nextInt(1, 9);
	 		turtleSpeed7 = rgen.nextInt(1, 9);
	 		turtleSpeed8 = rgen.nextInt(1, 9);
			
			aTurtle.move(ts * turtleSpeed1, 0);
			bTurtle.move(ts * turtleSpeed2, 0);
			cTurtle.move(ts * turtleSpeed3, 0);
			dTurtle.move(ts * turtleSpeed4, 0);
			eTurtle.move(ts * turtleSpeed5, 0);
			fTurtle.move(ts * turtleSpeed6, 0);
			gTurtle.move(ts * turtleSpeed7, 0);
			hTurtle.move(ts * turtleSpeed8, 0);
			
			pause(5);
	
			
			if (aTurtle.getX() >= 950)
			{
				aScore +=1;
				resetrace();
			}
			
			if (bTurtle.getX() >= 950)
			{
				bScore +=1;
				resetrace();
			}
			
			if (cTurtle.getX() >= 950)
			{
				cScore +=1;
				resetrace();
			}
			
			if (dTurtle.getX() >= 950)
			{
				dScore +=1;
				resetrace();
			}
			
			if (eTurtle.getX() >= 950)
			{
				eScore +=1;
				resetrace();
			}
			
			if (fTurtle.getX() >= 950)
			{
				fScore +=1;
				resetrace();
			}
			
			if (gTurtle.getX() >= 950)
			{
				gScore +=1;
				resetrace();
			}
			
			if (hTurtle.getX() >= 950)
			{
				hScore +=1;
				resetrace();
			}
		}
	}
	
	private void meter200()
	{
		while(meter200)
		{
			pause(5);
			
			turtleSpeed1 = rgen.nextInt(1, 9);
	 		turtleSpeed2 = rgen.nextInt(1, 9);
	 		turtleSpeed3 = rgen.nextInt(1, 9);
	 		turtleSpeed4 = rgen.nextInt(1, 9);
	 		turtleSpeed5 = rgen.nextInt(1, 9);
	 		turtleSpeed6 = rgen.nextInt(1, 9);
	 		turtleSpeed7 = rgen.nextInt(1, 9);
	 		turtleSpeed8 = rgen.nextInt(1, 9);
			
			if (aTurtle.getX() >= 950)
			{
				aTurtle.move(50, 150);
				aLapCount += 1;
				
			}
			if (bTurtle.getX() >= 950)
			{
				bTurtle.move(50, 250);
				bLapCount += 1;
				
			}
			if (cTurtle.getX() >= 950)
			{
				cTurtle.move(50, 350);
				cLapCount += 1;
				
			}
			if (dTurtle.getX() >= 950)
			{
				dTurtle.move(50, 450);
				dLapCount += 1;
				
			}
			if (eTurtle.getX() >= 950)
			{
				eTurtle.move(50, 550);
				eLapCount += 1;
				
			}
			if (fTurtle.getX() >= 950)
			{
				fTurtle.move(50, 650);
				fLapCount += 1;
			}
			if (gTurtle.getX() >= 950)
			{
				gTurtle.move(50, 750);
				gLapCount += 1;
			}
			if (hTurtle.getX() >= 950)
			{
				hTurtle.move(50, 850);
				hLapCount += 1;
			}
			
			if(aLapCount == 1 || bLapCount == 1 || cLapCount == 1 || dLapCount == 1 || eLapCount == 1 || fLapCount == 1 || gLapCount == 1 || hLapCount == 1)
			{
				add(finishLine);
			}
			
			aTurtle.move(ts * turtleSpeed1, 0);
			bTurtle.move(ts * turtleSpeed2, 0);
			cTurtle.move(ts * turtleSpeed3, 0);
			dTurtle.move(ts * turtleSpeed4, 0);
			eTurtle.move(ts * turtleSpeed5, 0);
			fTurtle.move(ts * turtleSpeed6, 0);
			gTurtle.move(ts * turtleSpeed7, 0);
			hTurtle.move(ts * turtleSpeed8, 0);
			
			if (aLapCount == 2)
			{
				aScore +=1;
				resetrace();
			}
			
			if (bLapCount == 2)
			{
				cScore +=1;
				resetrace();
			}
			
			if (cLapCount == 2)
			{
				cScore +=1;
				resetrace();
			}
			
			if (dLapCount == 2)
			{
				dScore +=1;
				resetrace();
			}
			
			if (eLapCount == 2)
			{
				eScore +=1;
				resetrace();
			}
			
			if (fLapCount == 2)
			{
				fScore +=1;
				resetrace();
			}
			
			if (gLapCount == 2)
			{
				gScore +=1;
				resetrace();
			}
			
			if (hLapCount == 2)
			{
				hScore +=1;
				resetrace();
			}
		}
	}
	
	private void meter400()
	{
		while(meter400)
		{
			pause(5);
			
			if (aTurtle.getX() >= 950)
			{
				aTurtle.setLocation(50, 150);
				aLapCount += 1;
				
			}
			if (bTurtle.getX() >= 950)
			{
				bTurtle.setLocation(50, 250);
				bLapCount += 1;
				
			}
			if (cTurtle.getX() >= 950)
			{
				cTurtle.setLocation(50, 350);
				cLapCount += 1;
				
			}
			if (dTurtle.getX() >= 950)
			{
				dTurtle.setLocation(50, 450);
				dLapCount += 1;
				
			}
			if (eTurtle.getX() >= 950)
			{
				eTurtle.setLocation(50, 550);
				eLapCount += 1;
				
			}
			if (fTurtle.getX() >= 950)
			{
				fTurtle.setLocation(50, 650);
				fLapCount += 1;
				
			}
			if (gTurtle.getX() >= 950)
			{
				gTurtle.setLocation(50, 750);
				gLapCount += 1;
				
			}
			if (hTurtle.getX() >= 950)
			{
				hTurtle.setLocation(50, 850);
				hLapCount += 1;
				
			}
			
			if(aLapCount == 3 || bLapCount == 3 || cLapCount == 3 || dLapCount == 3 || eLapCount == 3 || fLapCount == 3 || gLapCount == 3 || hLapCount == 3)
			{
				add(finishLine);
			}
			
			turtleSpeed1 = rgen.nextInt(1, 9);
	 		turtleSpeed2 = rgen.nextInt(1, 9);
	 		turtleSpeed3 = rgen.nextInt(1, 9);
	 		turtleSpeed4 = rgen.nextInt(1, 9);
	 		turtleSpeed5 = rgen.nextInt(1, 9);
	 		turtleSpeed6 = rgen.nextInt(1, 9);
	 		turtleSpeed7 = rgen.nextInt(1, 9);
	 		turtleSpeed8 = rgen.nextInt(1, 9);
			
			aTurtle.move(ts * turtleSpeed1, 0);
			bTurtle.move(ts * turtleSpeed2, 0);
			cTurtle.move(ts * turtleSpeed3, 0);
			dTurtle.move(ts * turtleSpeed4, 0);
			eTurtle.move(ts * turtleSpeed5, 0);
			fTurtle.move(ts * turtleSpeed6, 0);
			gTurtle.move(ts * turtleSpeed7, 0);
			hTurtle.move(ts * turtleSpeed8, 0);
			
			
			if (aLapCount == 4)
			{
				aScore +=1;
				resetrace();
			}
			
			if (bLapCount == 4)
			{
				bScore +=1;
				resetrace();
			}
			
			if (cLapCount == 4)
			{
				cScore +=1;
				resetrace();
			}
			
			if (dLapCount == 4)
			{
				dScore +=1;
				resetrace();
			}
			
			if (eLapCount == 4)
			{
				
				eScore +=1;
				resetrace();
			}
			
			if (fLapCount == 4)
			{
				fScore +=1;
				resetrace();
			}
			
			if (gLapCount == 4)
			{
				gScore +=1;
				resetrace();
			}
			
			if (hLapCount == 4)
			{
				hScore +=1;
				resetrace();
			}
		}
	}
	
	private void resetrace()
	{
		ascore.setLabel("Red Ned's Lap Count =" + aScore);
		bscore.setLabel("Baby Barf's Lap Count =" + bScore);
		cscore.setLabel("Orange's Lap Count =" + cScore);
		dscore.setLabel("Purple Nurple's Lap Count =" + dScore);
		escore.setLabel("Blue Sue's Lap Count =" + eScore);
		fscore.setLabel("Sandy Randy's Lap Count =" + fScore);
		gscore.setLabel("Mint Jun's Lap Count =" + gScore);
		hscore.setLabel("Random's Lap Count =" + hScore);
		
		removeAll();
		addSelect();
		add(ascore);
		add(bscore);
		add(cscore);
		add(dscore);
		add(escore);
		add(fscore);
		add(gscore);
		add(hscore);
		add(oButt);
		add(aButt);
		add(hButt);
		add(playAgain);
		add(restart);
		add(mainMenu);
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				warmUp();
			}
			if(select.getX() >= 375 && select.getX() <= 625 && select.getY() <= 950 && select.getY() >= 700)
			{
				removeAll();
				aScore = 0;
				bScore = 0;
				cScore = 0;
				dScore = 0;
				eScore = 0;
				fScore = 0;
				gScore = 0;
				hScore = 0;
				turtlerace();
			}
			if(select.getX() >= 675 && select.getX() <= 925 && select.getY() <= 950 && select.getY() >= 700)
			{
				mainmenu();
			}
		}
	}
	
	private void mainmenu()
	{
		removeAll();
		score = 0;
		aScore = 0;
		bScore = 0;
		cScore = 0;
		dScore = 0;
		eScore = 0;
		fScore = 0;
		gScore = 0;
		hScore = 0;
		run();
	}
	
	private void countdown()
	{
		countdown1 = new GLabel ("1", 440, 600);
		countdown1.setFont(Font240);
		
		countdown2 = new GLabel ("2", 440, 600);
		countdown2.setFont(Font240);
		
		countdown3 = new GLabel ("3", 440, 600);
		countdown3.setFont(Font240);
		
		add(countdown3);
		pause(1000);
		remove(countdown3);
		add(countdown2);
		pause(1000);
		remove(countdown2);
		add(countdown1);
		pause(1000);
		remove(countdown1);
	}
	
	private void addBackground()
	{
		setBackground(Lane2);
		
		stem = new GRect(475, -1000, 50, 2000);
		stem.setFilled(true);
		stem.setFillColor(Stem);
		
		leaf1 = new GRect(-20, -50, 50, 200);
		leaf1.setFilled(true);
		leaf1.setFillColor(Leaf);
		
		leaf3 = new GRect(970, -50, 50, 200);
		leaf3.setFilled(true);
		leaf3.setFillColor(Leaf);
		
		leaf2 = new GRect(30, -50, 50, 100);
		leaf2.setFilled(true);
		leaf2.setFillColor(Leaf);
		
		leaf4 = new GRect(0, 0, 1000, 25);
		leaf4.setFilled(true);
		leaf4.setFillColor(Leaf);
		
		leafcover = new GRect(0, 0, 50, 49);
		leafcover.setFilled(true);
		leafcover.setColor(Leaf);
		
		leafcover2 = new GRect(0, 0, 1000, 24);
		leafcover2.setFilled(true);
		leafcover2.setColor(Leaf);
		
		ground = new GRect(-2000, 950, 4000, 4000);
		ground.setFilled(true);
		ground.setFillColor(Ground);
		
		add(stem);
		add(leaf4);
		add(leaf1);
		add(leaf3);
		add(leaf2);
		add(leafcover);
		add(leafcover2);
		add(ground);
	}
	
	private void nextColor()
	{
		nextColor1 = rgen.nextInt(1, 9);
		if(nextColor1 == 1)
		{
			redGen = true;
			rekt1.setFillColor(o);
			basket.setFillColor(o);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("RED");
				if(level3)
				{
					word.setColor(Color.red);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 2)
		{
			orangeGen = true;
			rekt1.setFillColor(Color.orange);
			basket.setFillColor(Color.orange);
			if(level2 || level3 || level4)
			{
				word.setFont(Font20);
				word.setLabel("ORANGE");
				word.setColor(Color.black);
				if(level3)
				{
					word.setColor(Color.orange);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 3)
		{
			yellowGen = true;
			rekt1.setFillColor(Color.yellow);
			basket.setFillColor(Color.yellow);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("YELLOW");
				word.setColor(Color.black);
				if(level3)
				{
					word.setColor(Color.yellow);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 4)
		{
			greenGen = true;
			rekt1.setFillColor(a);
			basket.setFillColor(a);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("GREEN");
				word.setColor(Color.black);
				if(level3)
				{
					word.setColor(a);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 5)
		{
			blueGen = true;
			rekt1.setFillColor(h);
			basket.setFillColor(h);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("BLUE");
				if(level3)
				{
					word.setColor(h);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 6)
		{
			purpleGen = true;
			rekt1.setFillColor(Purple);
			basket.setFillColor(Purple);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("PURPLE");
				if(level3)
				{
					word.setColor(Purple);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 7)
		{
			brownGen = true;
			rekt1.setFillColor(Brown);
			basket.setFillColor(Brown);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("BROWN");
				if(level3)
				{
					word.setColor(Brown);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 8)
		{
			pinkGen = true;
			rekt1.setFillColor(Pink);
			basket.setFillColor(Pink);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("PINK");
				if(level3)
				{
					word.setColor(Pink);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 9)
		{
			grayGen = true;
			rekt1.setFillColor(Color.gray);
			basket.setFillColor(Color.gray);
			if(level2 || level3 || level4)
			{
				word.setFont(Font25);
				word.setLabel("GRAY");
				if(level3)
				{
					word.setColor(Color.gray);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(level4)
		{
			word.setFont(Font30);
			word.setColor(Color.black);
			black.setColor(Color.black);
			white.setColor(Color.black);
		}
	}
	
	private void names()
	{

		setBackground(Color.white);
		
		enterNames = new GLabel("Please Enter P1 & P2 Names in Console" , 170, 500);
		enterNames.setFont(Font35);
		add(enterNames);
		
		System.out.print("Enter P1's Name: ");
		P1 = user_input.next( );
		
		System.out.print("Enter P2's Name: ");
		P2 = user_input.next( );
		
		removeAll();
		player1 = new GLabel(P1 + "'s Score: " + p1Score, 50, 980);
		player1.setFont(Font25);
		add(player1);
		
		player2 = new GLabel(P2 + "'s Score: " + p2Score, 750, 980);
		player2.setFont(Font25);
		add(player2);
		
		P1Turn = new GLabel(P1 + "'s Turn", 350, 70);
		P1Turn.setFont(Font50);
		
		P2Turn = new GLabel(P2 + "'s Turn", 350, 70);
		P2Turn.setFont(Font50);
		
		loadCards1();
		addSelect();
	}
	
	private void loadCards1()
	{
		c = rgen.nextColor();
		
		//red
		card1 = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card1.setFilled(true);
		card1.setColor(Color.RED);
		card1cover = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card1cover.setFilled(true);
		card1cover.setColor(c);
		turtle1 = new GTurtle(cardSep + 2*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 1*(cardHeight + cardSep) + cardHeight/2);
		card2 = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card2.setFilled(true);
		card2.setColor(Color.RED);
		card2cover = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card2cover.setFilled(true);
		card2cover.setColor(c);
		turtle2 = new GTurtle(cardSep + 3*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 3*(cardHeight + cardSep) + cardHeight/2);
		
		//orange
		card3 = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card3.setFilled(true);
		card3.setColor(Color.orange);
		card3cover = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card3cover.setFilled(true);
		card3cover.setColor(c);
		turtle3 = new GTurtle(cardSep + 0*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 1*(cardHeight + cardSep) + cardHeight/2);
		card4 = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card4.setFilled(true);
		card4.setColor(Color.orange);
		card4cover = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card4cover.setFilled(true);
		card4cover.setColor(c);
		turtle4 = new GTurtle(cardSep + 0*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 3*(cardHeight + cardSep) + cardHeight/2);
		
		//yellow
		card5 = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card5.setFilled(true);
		card5.setColor(Color.yellow);
		card5cover = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card5cover.setFilled(true);
		card5cover.setColor(c);
		turtle5 = new GTurtle(cardSep + 1*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 1*(cardHeight + cardSep) + cardHeight/2);
		card6 = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card6.setFilled(true);
		card6.setColor(Color.yellow);
		card6cover = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card6cover.setFilled(true);
		card6cover.setColor(c);
		turtle6 = new GTurtle(cardSep + 2*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 2*(cardHeight + cardSep) + cardHeight/2);
		
		//green
		card7 = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card7.setFilled(true);
		card7.setColor(Color.green);
		card7cover = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card7cover.setFilled(true);
		card7cover.setColor(c);
		turtle7 = new GTurtle(cardSep + 3*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 0*(cardHeight + cardSep) + cardHeight/2);
		card8 = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card8.setFilled(true);
		card8.setColor(Color.green);
		card8cover = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card8cover.setFilled(true);
		card8cover.setColor(c);
		turtle8 = new GTurtle(cardSep + 1*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 2*(cardHeight + cardSep) + cardHeight/2);
		//blue
		card9 = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card9.setFilled(true);
		card9.setColor(Color.blue);
		card9cover = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card9cover.setFilled(true);
		card9cover.setColor(c);
		turtle9 = new GTurtle(cardSep + 2*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 0*(cardHeight + cardSep) + cardHeight/2);
		card10 = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card10.setFilled(true);
		card10.setColor(Color.blue);
		card10cover = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card10cover.setFilled(true);
		card10cover.setColor(c);
		turtle10 = new GTurtle(cardSep + 1*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 0*(cardHeight + cardSep) + cardHeight/2);
		
		//purple
		card11 = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card11.setFilled(true);
		card11.setColor(Purple);
		card11cover = new GRect(cardSep + 1*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card11cover.setFilled(true);
		card11cover.setColor(c);
		turtle11 = new GTurtle(cardSep + 1*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 3*(cardHeight + cardSep) + cardHeight/2);
		card12 = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card12.setFilled(true);
		card12.setColor(Purple);
		card12cover = new GRect(cardSep + 2*(cardWidth+cardSep), cardYOffset + 3
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card12cover.setFilled(true);
		card12cover.setColor(c);
		turtle12 = new GTurtle(cardSep + 2*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 3*(cardHeight + cardSep) + cardHeight/2);
		
		//pink
		card13 = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card13.setFilled(true);
		card13.setColor(Pink);
		card13cover = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 1
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card13cover.setFilled(true);
		card13cover.setColor(c);
		turtle13 = new GTurtle(cardSep + 3*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 1*(cardHeight + cardSep) + cardHeight/2);
		card14 = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card14.setFilled(true);
		card14.setColor(Pink);
		card14cover = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 0
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card14cover.setFilled(true);
		card14cover.setColor(c);
		turtle14 = new GTurtle(cardSep + 0*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 0*(cardHeight + cardSep) + cardHeight/2);

		
		//black
		card15 = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card15.setFilled(true);
		card15.setColor(Color.black);
		card15cover = new GRect(cardSep + 0*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card15cover.setFilled(true);
		card15cover.setColor(c);
		turtle15 = new GTurtle(cardSep + 0*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 2*(cardHeight + cardSep) + cardHeight/2);
		card16 = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight); 
		card16.setFilled(true);
		card16.setColor(Color.black);
		card16cover = new GRect(cardSep + 3*(cardWidth+cardSep), cardYOffset + 2
				*(cardHeight + cardSep), cardWidth, cardHeight);
		card16cover.setFilled(true);
		card16cover.setColor(c);
		turtle16 = new GTurtle(cardSep + 3*(cardWidth+cardSep) + ((cardWidth /2)),
				cardYOffset + 2*(cardHeight + cardSep) + cardHeight/2);

		
		add(card1);
		add(card1cover);
		add(turtle1);
		add(card2);
		add(card2cover);
		add(turtle2);
		add(card3);
		add(card3cover);
		add(turtle3);
		add(card4);
		add(card4cover);
		add(turtle4);
		add(card5);
		add(card5cover);
		add(turtle5);
		add(card6);
		add(card6cover);
		add(turtle6);
		add(card7);
		add(card7cover);
		add(turtle7);
		add(card8);
		add(card8cover);
		add(turtle8);
		add(card9);
		add(card9cover);
		add(turtle9);
		add(card10);
		add(card10cover);
		add(turtle10);
		add(card11);
		add(card11cover);
		add(turtle11);
		add(card12);
		add(card12cover);
		add(turtle12);
		add(card13);
		add(card13cover);
		add(turtle13);
		add(card14);
		add(card14cover);
		add(turtle14);
		add(card15);
		add(card15cover);
		add(turtle15);
		add(card16);
		add(card16cover);
		add(turtle16);	
		
		firstMatch1();
	}
	
	private void firstMatch1()
	{
		if(player1turn == true)
		{
			remove(P1Turn);
			add(P2Turn);
			player1turn = false;
			player2turn = true;
		}
		if(player2turn == true)
		{
			add(P1Turn);
			remove(P2Turn);
			player1turn = true;
			player2turn = false;
		}
		if(player1turn == false && player2turn == false)
		{
			add(P1Turn);
			player1turn = true;
		}
		while (searchX)
		{
			waitForClick();
			//Red Card 1
			if(select.getX() >= card1.getX() && select.getX() <= card1.getX() + cardWidth
					&& select.getY() >= card1.getY() && select.getY() <= card1.getY() + cardHeight
					&& redMatched == false)
			{
				redChosen = true;
				remove(card1cover);
				remove(turtle1);
				secondMatch1();
			}
			//Red Card 2
			if(select.getX() >= card2.getX() && select.getX() <= card2.getX() + cardWidth
					&& select.getY() >= card2.getY() && select.getY() <= card2.getY() + cardHeight
					&& redMatched == false)
			{
				red2Chosen = true;
				remove(card2cover);
				remove(turtle2);
				secondMatch1();
			}
			//Orange Card 1
			if(select.getX() >= card3.getX() && select.getX() <= card3.getX() + cardWidth
					&& select.getY() >= card3.getY() && select.getY() <= card3.getY() + cardHeight
					&& orangeMatched == false)
			{
				orangeChosen = true;
				remove(card3cover);
				remove(turtle3);
				secondMatch1();
			}
			if(select.getX() >= card4.getX() && select.getX() <= card4.getX() + cardWidth
					&& select.getY() >= card4.getY() && select.getY() <= card4.getY() + cardHeight
					&& orangeMatched == false)
			{
				orange2Chosen = true;
				remove(card4cover);
				remove(turtle4);
				secondMatch1();
			}
			if(select.getX() >= card5.getX() && select.getX() <= card5.getX() + cardWidth
					&& select.getY() >= card5.getY() && select.getY() <= card5.getY() + cardHeight
					&& yellowMatched == false)
			{
				yellowChosen = true;
				remove(card5cover);
				remove(turtle5);
				secondMatch1();
			}
			if(select.getX() >= card6.getX() && select.getX() <= card6.getX() + cardWidth
					&& select.getY() >= card6.getY() && select.getY() <= card6.getY() + cardHeight
					&& yellowMatched == false)
			{
				yellow2Chosen = true;
				remove(card6cover);
				remove(turtle6);
				secondMatch1();
			}
			if(select.getX() >= card7.getX() && select.getX() <= card7.getX() + cardWidth
					&& select.getY() >= card7.getY() && select.getY() <= card7.getY() + cardHeight
					&& greenMatched == false)
			{
				greenChosen = true;
				remove(card7cover);
				remove(turtle7);
				secondMatch1();
			}
			if(select.getX() >= card8.getX() && select.getX() <= card8.getX() + cardWidth
					&& select.getY() >= card8.getY() && select.getY() <= card8.getY() + cardHeight
					&& greenMatched == false)
			{
				green2Chosen = true;
				remove(card8cover);
				remove(turtle8);
				secondMatch1();
			}
			if(select.getX() >= card9.getX() && select.getX() <= card9.getX() + cardWidth
					&& select.getY() >= card9.getY() && select.getY() <= card9.getY() + cardHeight
					&& blueMatched == false)
			{
				blueChosen = true;
				remove(card9cover);
				remove(turtle9);
				secondMatch1();
			}
			if(select.getX() >= card10.getX() && select.getX() <= card10.getX() + cardWidth
					&& select.getY() >= card10.getY() && select.getY() <= card10.getY() + cardHeight
					&& blueMatched == false)
			{
				blue2Chosen = true;
				remove(card10cover);
				remove(turtle10);
				secondMatch1();
			}
			if(select.getX() >= card11.getX() && select.getX() <= card11.getX() + cardWidth
					&& select.getY() >= card11.getY() && select.getY() <= card11.getY() + cardHeight
					&& purpleMatched == false)
			{
				purpleChosen = true;
				remove(card11cover);
				remove(turtle11);
				secondMatch1();
			}
			if(select.getX() >= card12.getX() && select.getX() <= card12.getX() + cardWidth
					&& select.getY() >= card12.getY() && select.getY() <= card12.getY() + cardHeight
					&& purpleMatched == false)
			{
				purple2Chosen = true;
				remove(card12cover);
				remove(turtle12);
				secondMatch1();
			}
			if(select.getX() >= card13.getX() && select.getX() <= card13.getX() + cardWidth
					&& select.getY() >= card13.getY() && select.getY() <= card13.getY() + cardHeight
					&& pinkMatched == false)
			{
				pinkChosen = true;
				remove(card13cover);
				remove(turtle13);
				secondMatch1();
			}
			if(select.getX() >= card14.getX() && select.getX() <= card14.getX() + cardWidth
					&& select.getY() >= card14.getY() && select.getY() <= card14.getY() + cardHeight
					&& pinkMatched == false)
			{
				pink2Chosen = true;
				remove(card14cover);
				remove(turtle14);
				secondMatch1();
			}
			if(select.getX() >= card15.getX() && select.getX() <= card15.getX() + cardWidth
					&& select.getY() >= card15.getY() && select.getY() <= card15.getY() + cardHeight
					&& blackMatched == false)
			{
				blackChosen = true;
				remove(card15cover);
				remove(turtle15);
				secondMatch1();
			}
			if(select.getX() >= card16.getX() && select.getX() <= card16.getX() + cardWidth
					&& select.getY() >= card16.getY() && select.getY() <= card16.getY() + cardHeight
					&& blackMatched == false)
			{
				black2Chosen = true;
				remove(card16cover);
				remove(turtle16);
				secondMatch1();
			}
		}
	}
	
	private void secondMatch1()
	{
		while (searchX)
		{
			waitForClick();
			//Red Card 1
			if(select.getX() >= card1.getX() && select.getX() <= card1.getX() + cardWidth
					&& select.getY() >= card1.getY() && select.getY() <= card1.getY() + cardHeight
					&& redMatched == false && red2Chosen == true)
			{
				redChosen = false;
				red2Chosen = false;
				redMatched = true;
				remove(card1);
				remove(card2);
				remove(card1cover);
				remove(card2cover);
				remove(turtle1);
				remove(turtle2);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			//Red Card 2
			if(select.getX() >= card2.getX() && select.getX() <= card2.getX() + cardWidth
					&& select.getY() >= card2.getY() && select.getY() <= card2.getY() + cardHeight
					&& redMatched == false && redChosen == true)
			{
				redChosen = false;
				red2Chosen = false;
				redMatched = true;
				remove(card1);
				remove(card2);
				remove(card1cover);
				remove(card2cover);
				remove(turtle1);
				remove(turtle2);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			//Orange Card 1
			if(select.getX() >= card3.getX() && select.getX() <= card3.getX() + cardWidth
					&& select.getY() >= card3.getY() && select.getY() <= card3.getY() + cardHeight
					&& orangeMatched == false && orange2Chosen == true)
			{
				orangeChosen = false;
				orange2Chosen = false;
				orangeMatched = true;
				remove(card3);
				remove(card4);
				remove(card3cover);
				remove(card4cover);
				remove(turtle3);
				remove(turtle4);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card4.getX() && select.getX() <= card4.getX() + cardWidth
					&& select.getY() >= card4.getY() && select.getY() <= card4.getY() + cardHeight
					&& orangeMatched == false && orangeChosen == true)
			{
				orangeChosen = false;
				orange2Chosen = false;
				orangeMatched = true;
				remove(card3);
				remove(card4);
				remove(card3cover);
				remove(card4cover);
				remove(turtle3);
				remove(turtle4);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card5.getX() && select.getX() <= card5.getX() + cardWidth
					&& select.getY() >= card5.getY() && select.getY() <= card5.getY() + cardHeight
					&& yellowMatched == false && yellow2Chosen == true)
			{
				yellowChosen = false;
				yellow2Chosen = false;
				yellowMatched = true;
				remove(card5);
				remove(card6);
				remove(card5cover);
				remove(card6cover);
				remove(turtle5);
				remove(turtle6);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card6.getX() && select.getX() <= card6.getX() + cardWidth
					&& select.getY() >= card6.getY() && select.getY() <= card6.getY() + cardHeight
					&& yellowMatched == false && yellowChosen == true)
			{
				yellowChosen = false;
				yellow2Chosen = false;
				yellowMatched = true;
				remove(card5);
				remove(card6);
				remove(card5cover);
				remove(card6cover);
				remove(turtle5);
				remove(turtle6);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card7.getX() && select.getX() <= card7.getX() + cardWidth
					&& select.getY() >= card7.getY() && select.getY() <= card7.getY() + cardHeight
					&& greenMatched == false && green2Chosen == true)
			{
				greenChosen = false;
				green2Chosen = false;
				greenMatched = true;
				remove(card7);
				remove(card8);
				remove(card7cover);
				remove(card8cover);
				remove(turtle7);
				remove(turtle8);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card8.getX() && select.getX() <= card8.getX() + cardWidth
					&& select.getY() >= card8.getY() && select.getY() <= card8.getY() + cardHeight
					&& greenMatched == false && greenChosen == true)
			{
				greenChosen = false;
				green2Chosen = false;
				greenMatched = true;
				remove(card7);
				remove(card8);
				remove(card7cover);
				remove(card8cover);
				remove(turtle7);
				remove(turtle8);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card9.getX() && select.getX() <= card9.getX() + cardWidth
					&& select.getY() >= card9.getY() && select.getY() <= card9.getY() + cardHeight
					&& blueMatched == false && blue2Chosen == true)
			{
				blueChosen = false;
				blue2Chosen = false;
				blueMatched = true;
				remove(card9);
				remove(card10);
				remove(card9cover);
				remove(card10cover);
				remove(turtle9);
				remove(turtle10);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card10.getX() && select.getX() <= card10.getX() + cardWidth
					&& select.getY() >= card10.getY() && select.getY() <= card10.getY() + cardHeight
					&& blueMatched == false && blueChosen == true)
			{
				blueChosen = false;
				blue2Chosen = false;
				blueMatched = true;
				remove(card9);
				remove(card10);
				remove(card9cover);
				remove(card10cover);
				remove(turtle9);
				remove(turtle10);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card11.getX() && select.getX() <= card11.getX() + cardWidth
					&& select.getY() >= card11.getY() && select.getY() <= card11.getY() + cardHeight
					&& purpleMatched == false && purple2Chosen == true)
			{
				purpleChosen = false;
				purple2Chosen = false;
				purpleMatched = true;
				remove(card11);
				remove(card12);
				remove(card11cover);
				remove(card12cover);
				remove(turtle11);
				remove(turtle12);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card12.getX() && select.getX() <= card12.getX() + cardWidth
					&& select.getY() >= card12.getY() && select.getY() <= card12.getY() + cardHeight
					&& purpleMatched == false && purpleChosen == true)
			{
				purpleChosen = false;
				purple2Chosen = false;
				purpleMatched = true;
				remove(card11);
				remove(card12);
				remove(card11cover);
				remove(card12cover);
				remove(turtle11);
				remove(turtle12);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card13.getX() && select.getX() <= card13.getX() + cardWidth
					&& select.getY() >= card13.getY() && select.getY() <= card13.getY() + cardHeight
					&& pinkMatched == false && pink2Chosen == true)
			{
				pinkChosen = false;
				pink2Chosen = false;
				pinkMatched = true;
				remove(card13);
				remove(card14);
				remove(card13cover);
				remove(card14cover);
				remove(turtle13);
				remove(turtle14);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card14.getX() && select.getX() <= card14.getX() + cardWidth
					&& select.getY() >= card14.getY() && select.getY() <= card14.getY() + cardHeight
					&& pinkMatched == false && pinkChosen == true)
			{
				pinkChosen = false;
				pink2Chosen = false;
				pinkMatched = true;
				remove(card13);
				remove(card14);
				remove(card13cover);
				remove(card14cover);
				remove(turtle13);
				remove(turtle14);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card15.getX() && select.getX() <= card15.getX() + cardWidth
					&& select.getY() >= card15.getY() && select.getY() <= card15.getY() + cardHeight
					&& blackMatched == false && black2Chosen == true)
			{
				blackChosen = false;
				black2Chosen = false;
				blackMatched = true;
				remove(card15);
				remove(card16);
				remove(card15cover);
				remove(card16cover);
				remove(turtle15);
				remove(turtle16);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			if(select.getX() >= card16.getX() && select.getX() <= card16.getX() + cardWidth
					&& select.getY() >= card16.getY() && select.getY() <= card16.getY() + cardHeight
					&& blackMatched == false && blackChosen == true)
			{
				blackChosen = false;
				black2Chosen = false;
				blackMatched = true;
				remove(card15);
				remove(card16);
				remove(card15cover);
				remove(card16cover);
				remove(turtle15);
				remove(turtle16);
				if(player1turn == true)
				{
					p1Score += 1;
					player1.setLabel(P1 + "'s Score: " + p1Score);
				}
				if(player2turn == true)
				{
					p2Score += 1;
					player2.setLabel(P2 + "'s Score: " + p2Score);
				}
				firstMatch1();
			}
			//Red Card 1
			if(select.getX() >= card1.getX() && select.getX() <= card1.getX() + cardWidth
					&& select.getY() >= card1.getY() && select.getY() <= card1.getY() + cardHeight
					&& redMatched == false && red2Chosen == false && redChosen == false)
			{
				redChosen = false;
				red2Chosen = false;
				remove(card1cover);
				remove(turtle1);
				resetCovers();
				firstMatch1();
			}
			//Red Card 2
			if(select.getX() >= card2.getX() && select.getX() <= card2.getX() + cardWidth
					&& select.getY() >= card2.getY() && select.getY() <= card2.getY() + cardHeight
					&& redMatched == false && red2Chosen == false && redChosen == false)
			{
				redChosen = false;
				red2Chosen = false;
				remove(card2cover);
				remove(turtle2);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			//Orange Card 1
			if(select.getX() >= card3.getX() && select.getX() <= card3.getX() + cardWidth
					&& select.getY() >= card3.getY() && select.getY() <= card3.getY() + cardHeight
					&& orangeMatched == false && orange2Chosen == false && orangeChosen == false)
			{
				orangeChosen = false;
				orange2Chosen = false;
				remove(card3cover);
				remove(turtle3);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card4.getX() && select.getX() <= card4.getX() + cardWidth
					&& select.getY() >= card4.getY() && select.getY() <= card4.getY() + cardHeight
					&& orangeMatched == false && orange2Chosen == false && orangeChosen == false)
			{
				orangeChosen = false;
				orange2Chosen = false;
				remove(card4cover);
				remove(turtle4);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card5.getX() && select.getX() <= card5.getX() + cardWidth
					&& select.getY() >= card5.getY() && select.getY() <= card5.getY() + cardHeight
					&& yellowMatched == false && yellow2Chosen == false && yellowChosen == false)
			{
				yellowChosen = false;
				yellow2Chosen = false;
				remove(card5cover);
				remove(turtle5);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card6.getX() && select.getX() <= card6.getX() + cardWidth
					&& select.getY() >= card6.getY() && select.getY() <= card6.getY() + cardHeight
					&& yellowMatched == false && yellow2Chosen == false && yellowChosen == false)
			{
				yellowChosen = false;
				yellow2Chosen = false;
				remove(card6cover);
				remove(turtle6);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card7.getX() && select.getX() <= card7.getX() + cardWidth
					&& select.getY() >= card7.getY() && select.getY() <= card7.getY() + cardHeight
					&& greenMatched == false && green2Chosen == false && greenChosen == false)
			{
				greenChosen = false;
				green2Chosen = false;
				remove(card7cover);
				remove(turtle7);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card8.getX() && select.getX() <= card8.getX() + cardWidth
					&& select.getY() >= card8.getY() && select.getY() <= card8.getY() + cardHeight
					&& greenMatched == false && green2Chosen == false && greenChosen == false)
			{
				greenChosen = false;
				green2Chosen = false;
				remove(card8cover);
				remove(turtle8);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card9.getX() && select.getX() <= card9.getX() + cardWidth
					&& select.getY() >= card9.getY() && select.getY() <= card9.getY() + cardHeight
					&& blueMatched == false && blue2Chosen == false && blueChosen == false)
			{
				blueChosen = false;
				blue2Chosen = false;
				remove(card9cover);
				remove(turtle9);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card10.getX() && select.getX() <= card10.getX() + cardWidth
					&& select.getY() >= card10.getY() && select.getY() <= card10.getY() + cardHeight
					&& blueMatched == false && blue2Chosen == false && blueChosen == false)
			{
				blueChosen = false;
				blue2Chosen = false;
				remove(card10cover);
				remove(turtle10);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card11.getX() && select.getX() <= card11.getX() + cardWidth
					&& select.getY() >= card11.getY() && select.getY() <= card11.getY() + cardHeight
					&& purpleMatched == false && purple2Chosen == false && purpleChosen == false)
			{
				purpleChosen = false;
				purple2Chosen = false;
				remove(card11cover);
				remove(turtle11);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card12.getX() && select.getX() <= card12.getX() + cardWidth
					&& select.getY() >= card12.getY() && select.getY() <= card12.getY() + cardHeight
					&& purpleMatched == false && purple2Chosen == false && purpleChosen == false)
			{
				purpleChosen = false;
				purple2Chosen = false;
				remove(card12cover);
				remove(turtle12);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card13.getX() && select.getX() <= card13.getX() + cardWidth
					&& select.getY() >= card13.getY() && select.getY() <= card13.getY() + cardHeight
					&& pinkMatched == false && pink2Chosen == false && pinkChosen == false)
			{
				pinkChosen = false;
				pink2Chosen = false;
				remove(card13cover);
				remove(turtle13);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card14.getX() && select.getX() <= card14.getX() + cardWidth
					&& select.getY() >= card14.getY() && select.getY() <= card14.getY() + cardHeight
					&& pinkMatched == false && pink2Chosen == false && pinkChosen == false)
			{
				pinkChosen = false;
				pink2Chosen = false;
				remove(card14cover);
				remove(turtle14);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card15.getX() && select.getX() <= card15.getX() + cardWidth
					&& select.getY() >= card15.getY() && select.getY() <= card15.getY() + cardHeight
					&& blackMatched == false && black2Chosen == false && blackChosen == false)
			{
				blackChosen = false;
				black2Chosen = false;
				remove(card15cover);
				remove(turtle15);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
			if(select.getX() >= card16.getX() && select.getX() <= card16.getX() + cardWidth
					&& select.getY() >= card16.getY() && select.getY() <= card16.getY() + cardHeight
					&& blackMatched == false && black2Chosen == false && blackChosen == false)
			{
				blackChosen = false;
				black2Chosen = false;
				remove(card16cover);
				remove(turtle16);
				pause(3000);
				resetCovers();
				firstMatch1();
			}
		}
	}
	
	private void resetCovers()
	{
		remove(card1cover);
		remove(turtle1);
		remove(card2cover);
		remove(turtle2);
		remove(card3cover);
		remove(turtle3);
		remove(card4cover);
		remove(turtle4);
		remove(card5cover);
		remove(turtle5);
		remove(card6cover);
		remove(turtle6);
		remove(card7cover);
		remove(turtle7);
		remove(card8cover);
		remove(turtle8);
		remove(card9cover);
		remove(turtle9);
		remove(card10cover);
		remove(turtle10);
		remove(card11cover);
		remove(turtle11);
		remove(card12cover);
		remove(turtle12);
		remove(card13cover);
		remove(turtle13);
		remove(card14cover);
		remove(turtle14);
		remove(card15cover);
		remove(turtle15);
		remove(card16cover);
		remove(turtle16);
		
		if(redMatched == false)
		{
			add(card1cover);
			add(turtle1);
			add(card2cover);
			add(turtle2);
		}
		if(orangeMatched == false)
		{
			add(card3cover);
			add(turtle3);
			add(card4cover);
			add(turtle4);
		}
		if(yellowMatched == false)
		{
			add(card5cover);
			add(turtle5);
			add(card6cover);
			add(turtle6);
		}
		if(greenMatched == false)
		{
			add(card7cover);
			add(turtle7);
			add(card8cover);
			add(turtle8);
		}
		if(blueMatched == false)
		{
			add(card9cover);
			add(turtle9);
			add(card10cover);
			add(turtle10);
		}
		if(purpleMatched == false)
		{
			add(card11cover);
			add(turtle11);
			add(card12cover);
			add(turtle12);
		}
		if(pinkMatched == false)
		{
			add(card13cover);
			add(turtle13);
			add(card14cover);
			add(turtle14);
		}
		if(blackMatched == false)
		{
			add(card15cover);
			add(turtle15);
			add(card16cover);
			add(turtle16);
		}
	}
	
	private void addSelect()
	{
		select = new GRect(getWidth() / 2 - selectWidth / 2,
				 getHeight() - selectYOffset, selectWidth, selectHeight);
		select.setFilled(true);
		select.setFillColor(Color.white);
		add(select);
	}
	
	public void mouseMoved(MouseEvent me)
	{
			int x = me.getX();
			int y = me.getY();
			
			if(select != null)
			{
				if(x > selectWidth / 2 && x < getWidth() - selectWidth / 2)
				{
					select.setLocation(x - selectWidth / 2, y - selectWidth / 2);
				}
			}
			if(basket != null)
			{
				if(x > basketWidth / 2 && x < getWidth() - basketWidth / 2)
				{
					basket.setLocation(x - basketWidth / 2, 1000 - basketHeight - basketYOffset);
				}
				
			}
	}
	
}


