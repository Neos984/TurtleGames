import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.util.MediaTools;
import acm.util.RandomGenerator;


public class TurtleGames extends GraphicsProgram 
{
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;
	
	public static final AudioClip muzak = Applet.newAudioClip(TurtleGames.class.getResource("Mining by Moonlight.mp3"));
	public static final AudioClip chomp = Applet.newAudioClip(TurtleGames.class.getResource("Chomp.wav"));
	public static final AudioClip error = Applet.newAudioClip(TurtleGames.class.getResource("Error.wav"));
	
	/** Dimensions of the select */
	private static final int selectWidth = 10;
	private static final int selectHeight = 10;
	
	private static final int basketWidth = 150;
	private static final int basketHeight = 150;
	
	private static final int rektWidth = 100;
	private static final int rektHeight = 100;

	private static final int cardWidth = 150;
	private static final int cardHeight = 150;
	
	private static final int cardSep = 50;
	
	private static final int numCardRows = 4;
	private static final int numCardsColumns = 5;
	
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
	private int lives = 3;
	private int timesdropped = 0;
	
	private double rand1 = Math.random()*100;
	private double rand2 = Math.random()*100;
	private double rand3 = Math.random()*100;
	private double rand4 = Math.random()*100;
	private double rand5 = Math.random()*100;
	private double rand6 = Math.random()*100;
	private double rand7 = Math.random()*100;
	private double rand8 = Math.random()*100;
	
	private GLabel drop;
	private GLabel tRace;
	private GLabel trig;
	private GLabel tGames;
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
	private GLabel Continue;
	private GLabel Level1;
	private GLabel Level2;
	private GLabel Level3;
	private GLabel uhOh;
	private GLabel nextLevel;
	private GLabel red;
	private GLabel orange;
	private GLabel yellow;
	private GLabel green;
	private GLabel blue;
	private GLabel purple;
	private GLabel indigo;
	private GLabel pink;
	private GLabel brown;
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
	
	private GRect gameButton1;
	private GRect gameButton2;
	private GRect gameButton3;
	private GRect gameButton4;
	
	private GRect select;
	private GRect oButt;
	private GRect aButt;
	private GRect hButt;
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
	
	private GRect turtlecover;
	private GRect redword;
	private GRect redcolor;
	private GRect orangeword;
	private GRect orangecolor;
	private GRect yellowword;
	private GRect yellowcolor;
	private GRect greenword;
	private GRect greencolor;
	private GRect blueword;
	private GRect bluecolor;
	private GRect indigoword;
	private GRect indigocolor;
	private GRect purpleword;
	private GRect purplecolor;
	private GRect pinkword;
	private GRect pinkcolor;
	private GRect brownword;
	private GRect browncolor;
	private GRect grayword;
	private GRect graycolor;
	private GRect blackword;
	private GRect blackcolor;
	private GRect whiteword;
	private GRect whitecolor;
	
	private GRect aRectangle;
	private GRect bRectangle;
	private GRect cRectangle;
	private GRect dRectangle;
	private GRect eRectangle;
	private GRect fRectangle;
	private GRect gRectangle;
	private GRect hRectangle;
	private GRect finishLine;
	
	private boolean scoredPoint = false;
	private boolean firstTime = true;
	private final boolean numNotGen = true;
	private final boolean searchX = true;
	private boolean Practice = false;
	
	private boolean toddlershowcase = true;
	private boolean level1 = false;
	private boolean level2 = false;
	private boolean level3 = false;
	private boolean rekt1gone = false;
	private boolean rekt2gone = false;
	private boolean rekt3gone = false;
	private boolean redUsed = false;
	private boolean orangeUsed = false;
	private boolean yellowUsed = false;
	private boolean greenUsed = false;
	private boolean blueUsed = false;
	private boolean inidgoUsed = false;
	private boolean purpleUsed = false;
	private boolean brownUsed = false;
	private boolean pinkUsed = false;
	private boolean isLoser = false;
	
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
	
	
	/** Troll Font */
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
	
	ArrayList<GRect> rekt = new ArrayList<GRect>();
	ArrayList<GRect> card = new ArrayList<GRect>();
	ArrayList<GLabel> words = new ArrayList<GLabel>();
	
	RandomGenerator rg = new RandomGenerator();
	/** Randomly Generated Color*/
	Color c = rgen.nextColor();
	Color o = new Color(255,0,0);
	Color a = new Color(0,255,0);
	Color h = new Color(0,0,255);
	Color ocean = new Color(9,130,210);
	
	Color Leaf = new Color(50,255,0);
	Color Ground = new Color(100,255,0);
	
	Color Indigo = new Color(75,0,130);
	Color Purple = new Color(255,0,255);
	Color Pink = new Color(255,20,147);
	Color Brown = new Color(188,143,143);
	
	Color Stem = new Color(160,100,100);
	
	Color Lane1 = new Color(180,0,0);
	Color Lane2 = new Color(130, 148, 53);
	Color Lane3 = new Color(240,165,32);
	Color Lane4 = new Color(155,0,200);
	Color Lane5 = new Color(0,55,255);
	Color Lane6 = new Color(255,255,200);
	Color Lane7 = new Color(132,242,125);
	Color Lane8 = new Color(9,130,210);
	
	Color rnd = rgen.nextColor();
	
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
		
		playAgain = new GLabel("Play Again", 150, 850);
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
		add(trig);
		add(drop);
		add(tRace);
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 675 && select.getX() <= 925)
			{
				removeAll();
				turtlerace();
			}
			if(select.getX() >= 375 && select.getX() <= 625)
			{
				removeAll();
				turtledrop();
			}
			if(select.getX() >= 75 && select.getX() <= 325)
			{
				removeAll();
				triggyturtle();
			}
		}
	}
	  
	private void triggyturtle()
	{
		
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
			if(select.getX() >= 75 && select.getX() <= 325)
			{
				firstTime = false;
				removeAll();
;
				instructions();
			}
			if(select.getX() >= 375 && select.getX() <= 625)
			{
				firstTime = false;
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
				if(select.getX() >= 75 && select.getX() <= 325)
				{
					setup();
				}
				if(select.getX() >= 375 && select.getX() <= 625)
				{
					practice();
				}
				if(select.getX() >= 675 && select.getX() <= 925)
				{
					removeAll();
					triggyturtle();
				}
				}
			}
			if(select.getX() >= 675 && select.getX() <= 925)
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
		
		lapCount = new GLabel("Select Level", 400, 500);
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
			if(select.getX() >= 75 && select.getX() <= 325)
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
					if(select.getX() >= 75 && select.getX() <= 325)
					{
						level1 = true;
						removeAll();
						addNewRekts();
						countdown();
						dropdown();
					}
					if(select.getX() >= 375 && select.getX() <= 625)
					{
						level2 = true;
						removeAll();
						addNewRekts();
						countdown();
						dropdown2();
					}
					if(select.getX() >= 675 && select.getX() <= 925)
					{
						level3 = true;
						removeAll();
						addNewRekts();
						countdown();
						dropdown3();
					}
				}
			}
			if(select.getX() >= 675 && select.getX() <= 925)
			{
				mainmenu();
			}
		}
		
	}
	
	private void turtlematch()
	{
		//word = new GLabel(redword.getX() + 10, redword.getY() / 2);
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
			if(select.getX() >= 75 && select.getX() <= 325)
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
					if(select.getX() >= 75 && select.getX() <= 325)
					{
						removeAll();
						meter100 = true;
						warmUp();
						
					}
					if(select.getX() >= 375 && select.getX() <= 625)
					{
						removeAll();
						meter200 = true;
						warmUp();
					}
					if(select.getX() >= 675 && select.getX() <= 925)
					{
						removeAll();
						meter400 = true;
						warmUp();
					}
				}
			}
			if(select.getX() >= 675 && select.getX() <= 925)
			{
				mainmenu();
			}	
		}
	}
			
	private void instructions()
	{
		firstTime = false;
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
		firstTime = false;
		
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
			if(select.getX() >= 75 && select.getX() <= 325)
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
			if(select.getX() >= 675 && select.getX() <= 925)
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
			if(select.getX() >= 375 && select.getX() <= 625)
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
			if(select.getX() >= 675 && select.getX() <= 925)
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
			if(select.getX() >= 75 && select.getX() <= 325)
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
			if(select.getX() >= 375 && select.getX() <= 625)
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
			
			rectSpeed1 = rgen.nextInt(3, 9);
			rectSpeed2 = rgen.nextInt(3, 9);
			rectSpeed3 = rgen.nextInt(3, 9);
			
			if(score == 10)
			{
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
				chomp.play();
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
			
			rectSpeed1 = rgen.nextInt(3, 9);
			rectSpeed2 = rgen.nextInt(3, 9);
			rectSpeed3 = rgen.nextInt(3, 9);
			
			
			if(score == 10)
			{
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
				chomp.play();
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
			
			rectSpeed1 = rgen.nextInt(3, 9);
			rectSpeed2 = rgen.nextInt(3, 9);
			rectSpeed3 = rgen.nextInt(3, 9);
			
			
			if(score == 10)
			{
				level3 = false;
				score = 0;
				if(toddlershowcase)
				{
					removeAll();
					turtledrop();
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
				white2.move(0, rv * rectSpeed3);
		
			
			pause(15);
			
			if(word.getX() <= basket.getX() + 150 && word.getX() >= basket.getX() - 99 && word.getY() >= 800 && word.getY() <= 1050)
			{
				rekt1gone = true;
				score += 1;
				scoreCount.setLabel("Score: " + score);
				System.out.println("Score : " + score);
				chomp.play();
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
		setBackground(Lane2);
		
		removeAll();
		
		addBackground();
		
		rekt1gone = false;
		rekt2gone = false;
		rekt3gone = false;
		
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
		black.setColor(Color.white);
		
		if(level1 || level2)
		{
			add(rekt2);	
		}
		if(level3 || level2)
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
		
		white2 = new GLabel("WHITE", rekt3Spawn, rektWidth / 2);
		white2.setFont(Font31);
		
		if(level1 || level2)
		{
			add(rekt3);	
		}
		if(level3 || level2)
		{
			if(level3)
			{
				white.setColor(Color.white);
				add(white2);
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
		add(drop);
		add(mainMenu);
		
		while(searchX)
		{
			waitForClick();
			if(select.getX() >= 75 && select.getX() <= 325)
			{
				
				removeAll();
				if(level1)
				{
					addNewRekts();
					dropdown();
				}
				turtledrop();
			}
			if(select.getX() >= 375 && select.getX() <= 625)
			{
				level1 = false;
				level2 = false;
				level3 = false;
				removeAll();
				turtledrop();
			}
			if(select.getX() >= 675 && select.getX() <= 925)
			{
				mainmenu();
			}
		}
	}
	
	private void addCards()
	{
		//nextCard = nextInt(1,24);
		
		word = new GLabel("", redword.getX() + 10, redword.getY() / 2);

	}
	
 	private void warmUp()
	{
		
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
		
		rand1 = Math.random()*100;
		rand2 = Math.random()*100;
		rand3 = Math.random()*100;
		rand4 = Math.random()*100;
		rand5 = Math.random()*100;
		rand6 = Math.random()*100;
		rand7 = Math.random()*100;
		rand8 = Math.random()*100;
		
		aTurtle.move(rand1, 0);
		bTurtle.move(rand2, 0);
		cTurtle.move(rand3, 0);
		dTurtle.move(rand4, 0);
		eTurtle.move(rand5, 0);
		fTurtle.move(rand6, 0);
		gTurtle.move(rand7, 0);
		hTurtle.move(rand8, 0);

		System.out.println("Red Ned:" + aTurtle.getX());
		System.out.println("Baby Barf:" + bTurtle.getX());
		System.out.println("Orange:" + cTurtle.getX());
		System.out.println("Purple Nurple:" + dTurtle.getX());
		System.out.println("Blue Sue:" + eTurtle.getX());
		System.out.println("Sandy Randy:" + fTurtle.getX());
		System.out.println("Mint Jun:" + gTurtle.getX());
		System.out.println("Random:" + hTurtle.getX());
		
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
		
		meter100();
	}
	
	private void meter200()
	{
		while(meter200)
		{
			
			if (aTurtle.getX() >= 950)
			{
				aTurtle.setLocation(50, 150);
				aLapCount += 1;
				meter200();
			}
			if (bTurtle.getX() >= 950)
			{
				bTurtle.setLocation(50, 250);
				bLapCount += 1;
				meter200();
			}
			if (cTurtle.getX() >= 950)
			{
				cTurtle.setLocation(50, 350);
				cLapCount += 1;
				meter200();
			}
			if (dTurtle.getX() >= 950)
			{
				dTurtle.setLocation(50, 450);
				dLapCount += 1;
				meter200();
			}
			if (eTurtle.getX() >= 950)
			{
				eTurtle.setLocation(50, 550);
				eLapCount += 1;
				meter200();
			}
			if (fTurtle.getX() >= 950)
			{
				fTurtle.setLocation(50, 650);
				fLapCount += 1;
				meter200();
			}
			if (gTurtle.getX() >= 950)
			{
				gTurtle.setLocation(50, 750);
				gLapCount += 1;
				meter200();
			}
			if (hTurtle.getX() >= 950)
			{
				hTurtle.setLocation(50, 850);
				hLapCount += 1;
				meter200();
			}
			
			remove(Ascore);
			remove(Bscore);
			remove(Cscore);
			remove(Dscore);
			remove(Escore);
			remove(Fscore);
			remove(Gscore);
			remove(Hscore);
			add(Ascore);
			add(Bscore);
			add(Cscore);
			add(Dscore);
			add(Escore);
			add(Fscore);
			add(Gscore);
			add(Hscore);
			
			if(aLapCount == 1 || bLapCount == 1 || cLapCount == 1 || dLapCount == 1 || eLapCount == 1 || fLapCount == 1 || gLapCount == 1 || hLapCount == 1)
			{
				add(finishLine);
			}
			
			rand1 = Math.random()*100;
			rand2 = Math.random()*100;
			rand3 = Math.random()*100;
			rand4 = Math.random()*100;
			rand5 = Math.random()*100;
			rand6 = Math.random()*100;
			rand7 = Math.random()*100;
			rand8 = Math.random()*100;
			
			aTurtle.setLocation(rand1, 0);
			bTurtle.setLocation(rand2, 0);
			cTurtle.setLocation(rand3, 0);
			dTurtle.setLocation(rand4, 0);
			eTurtle.setLocation(rand5, 0);
			fTurtle.setLocation(rand6, 0);
			gTurtle.setLocation(rand7, 0);
			hTurtle.setLocation(rand8, 0);
			
			System.out.println("Red Ned:" + aTurtle.getX());
			System.out.println("Baby Barf:" + bTurtle.getX());
			System.out.println("Orange:" + cTurtle.getX());
			System.out.println("Purple Nurple:" + dTurtle.getX());
			System.out.println("Blue Sue:" + eTurtle.getX());
			System.out.println("Sandy Randy:" + fTurtle.getX());
			System.out.println("Mint Jun:" + gTurtle.getX());
			System.out.println("Random:" + hTurtle.getX());
			
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
			if (aTurtle.getX() >= 950)
			{
				aTurtle.setLocation(50, 150);
				aLapCount += 1;
				meter400();
			}
			if (bTurtle.getX() >= 950)
			{
				bTurtle.setLocation(50, 250);
				bLapCount += 1;
				meter400();
			}
			if (cTurtle.getX() >= 950)
			{
				cTurtle.setLocation(50, 350);
				cLapCount += 1;
				meter400();
			}
			if (dTurtle.getX() >= 950)
			{
				dTurtle.setLocation(50, 450);
				dLapCount += 1;
				meter400();
			}
			if (eTurtle.getX() >= 950)
			{
				eTurtle.setLocation(50, 550);
				eLapCount += 1;
				meter400();
			}
			if (fTurtle.getX() >= 950)
			{
				fTurtle.setLocation(50, 650);
				fLapCount += 1;
				meter400();
			}
			if (gTurtle.getX() >= 950)
			{
				gTurtle.setLocation(50, 750);
				gLapCount += 1;
				meter400();
			}
			if (hTurtle.getX() >= 950)
			{
				hTurtle.setLocation(50, 850);
				hLapCount += 1;
				meter400();
			}
			
			remove(Ascore);
			remove(Bscore);
			remove(Cscore);
			remove(Dscore);
			remove(Escore);
			remove(Fscore);
			remove(Gscore);
			remove(Hscore);
			add(Ascore);
			add(Bscore);
			add(Cscore);
			add(Dscore);
			add(Escore);
			add(Fscore);
			add(Gscore);
			add(Hscore);
			
			
			if(aLapCount == 3 || bLapCount == 3 || cLapCount == 3 || dLapCount == 3 || eLapCount == 3 || fLapCount == 3 || gLapCount == 3 || hLapCount == 3)
			{
				add(finishLine);
			}
			
			rand1 = Math.random()*100;
			rand2 = Math.random()*100;
			rand3 = Math.random()*100;
			rand4 = Math.random()*100;
			rand5 = Math.random()*100;
			rand6 = Math.random()*100;
			rand7 = Math.random()*100;
			rand8 = Math.random()*100;
			
			aTurtle.setLocation(rand1, 0);
			bTurtle.setLocation(rand2, 0);
			cTurtle.setLocation(rand3, 0);
			dTurtle.setLocation(rand4, 0);
			eTurtle.setLocation(rand5, 0);
			fTurtle.setLocation(rand6, 0);
			gTurtle.setLocation(rand7, 0);
			hTurtle.setLocation(rand8, 0);
			
			System.out.println("Red Ned:" + aTurtle.getX());
			System.out.println("Baby Barf:" + bTurtle.getX());
			System.out.println("Orange:" + cTurtle.getX());
			System.out.println("Purple Nurple:" + dTurtle.getX());
			System.out.println("Blue Sue:" + eTurtle.getX());
			System.out.println("Sandy Randy:" + fTurtle.getX());
			System.out.println("Mint Jun:" + gTurtle.getX());
			System.out.println("Random:" + hTurtle.getX());
			
			if (aLapCount == 2)
			{
				aScore +=1;
				resetrace();
			}
			
			if (bLapCount == 2)
			{
				bScore +=1;
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
	
	private void resetrace()
	{
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
			if(select.getX() >= 75 && select.getX() <= 325)
			{
				removeAll();
				warmUp();
			}
			if(select.getX() >= 375 && select.getX() <= 625)
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
			if(select.getX() >= 675 && select.getX() <= 925)
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
		firstTime = true;
		run();
	}
	
	private void countdown()
	{
		countdown1 = new GLabel ("1", 500, 400);
		countdown1.setFont(Font50);
		
		countdown2 = new GLabel ("2", 500, 400);
		countdown2.setFont(Font50);
		
		countdown3 = new GLabel ("3", 500, 400);
		countdown3.setFont(Font50);
		
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
	
	private void pause()
	{
		add(paused);
		waitForClick();
		countdown();
	}
	
	private void addBackground()
	{
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
		nextColor1 = rgen.nextInt(1, 10);
		if(nextColor1 == 1)
		{
			rekt1.setFillColor(o);
			basket.setFillColor(o);
			if(level2 || level3)
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
			rekt1.setFillColor(Color.orange);
			basket.setFillColor(Color.orange);
			if(level2 || level3)
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
			rekt1.setFillColor(Color.yellow);
			basket.setFillColor(Color.yellow);
			if(level2 || level3)
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
			rekt1.setFillColor(a);
			basket.setFillColor(a);
			if(level2 || level3)
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
			rekt1.setFillColor(h);
			basket.setFillColor(h);
			if(level2 || level3)
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
			rekt1.setFillColor(Indigo);
			basket.setFillColor(Indigo);
			if(level2 || level3)
			{
				word.setFont(Font25);
				word.setLabel("INDIGO");
				if(level3)
				{
					word.setColor(Indigo);
					word.setFont(Font30);
				}
				add(word);
			}
		}
		if(nextColor1 == 7)
		{
			rekt1.setFillColor(Purple);
			basket.setFillColor(Purple);
			if(level2 || level3)
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
		if(nextColor1 == 8)
		{
			rekt1.setFillColor(Brown);
			basket.setFillColor(Brown);
			if(level2 || level3)
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
		if(nextColor1 == 9)
		{
			rekt1.setFillColor(Pink);
			basket.setFillColor(Pink);
			if(level2 || level3)
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
		if(nextColor1 == 10)
		{
			rekt1.setFillColor(Color.gray);
			basket.setFillColor(Color.gray);
			if(level2 || level3)
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
		
		if(select != null)
		{
			if(x > selectWidth / 2 && x < getWidth() - selectWidth / 2)
			{
				select.setLocation(x - selectWidth / 2, getHeight() - selectYOffset);
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


