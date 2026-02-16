# 🎮 GameSoft - The Ultimate Arena of Wits

A feature-rich **Java-based gaming platform** that brings classic hand games to life with an elegant command-line interface, real-time scoring, and persistent player statistics.

## ✨ Features

### 🎯 Three Classic Games
- **Morra** - An ancient finger-guessing game requiring strategy and quick thinking
- **Rock Paper Scissors** - The timeless battle of hand gestures
- **Number Guessing** - Test your intuition with 10 attempts to find the secret number

### 🏆 Player Management
- Unique username system (4-8 characters, starting with `@`)
- Persistent player profiles stored in MySQL database
- Real-time score tracking across all games
- Player rating system (1.0 - 5.0 stars)

### 📊 Leaderboard System
- **Dhurandhar** - The ultimate all-rounder with highest combined score
- **Top Rated Player** - Most skilled player based on opponent ratings
- View legends before starting your journey

### 🎨 User Experience
- Animated ASCII art intro sequence
- Stylized Unicode text throughout the interface
- Multi-threaded operations for smooth gameplay
- Game guides with YouTube tutorial links
- Account deletion option with confirmation flow

## 🛠️ Tech Stack

- **Language:** Java
- **Database:** MySQL 8.0+
- **JDBC:** MySQL Connector
- **Architecture:** Multi-threaded, modular design

## 📁 Project Structure

```
├── src/
│   ├── Main.java                          # Entry point & main menu
│   ├── GameIntroAnimation.java            # Animated welcome sequence
│   ├── GamePicker.java                    # Game selection & loading screens
│   ├── ActualOgPicker.java                # Leaderboard display menu
│   ├── MorraGameLogic.java                # Morra game implementation
│   ├── RockPaperScissorGameLogic.java     # RPS game implementation
│   ├── NumberGuessGameLogic.java          # Number guessing game logic
│   ├── DBConfigForGameSoft.java           # Database configuration
│   ├── SavingUserDataToDB.java            # User CRUD operations
│   └── WinnersWorld.java                  # Leaderboard queries
│

```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- MySQL Server 8.0+
- MySQL Connector/J (JDBC Driver)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/TechFourgeBuild/GameSoft.git
   cd gamesoft
   ```

2. **Set up the database**
   ```sql
   CREATE DATABASE gamesoft_db;
   USE gamesoft_db;
   
   CREATE TABLE credentials (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(8) UNIQUE NOT NULL,
       morrascore INT DEFAULT 0,
       rpsscore INT DEFAULT 0,
       numgscore INT DEFAULT 0,
       ratingofplayer DOUBLE DEFAULT 0.0
   );
   ```

3. **Configure database connection**
   
   Update `DBConfigForGameSoft.java`:
   ```java
   public final static String DB_URL = "jdbc:mysql://localhost:3306/gamesoft_db";
   public final static String USERNAME = "your_mysql_username";
   public final static String PASSWORD = "your_mysql_password";
   ```

4. **Add MySQL Connector to classpath**
   
   Download MySQL Connector/J from [official website](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/9.5.0)

5. **Compile and run**
   ```bash
   javac src/*.java
   java -cp .:mysql-connector-java.jar src/Main
   ```

## 🎮 How to Play

### First Time Setup
1. Launch the application
2. Choose option `1` to proceed
3. Select `n` for new account
4. Create username (format: `@YourName`, 4-8 characters)

### Game Selection
- **Option 1:** Morra - Guess the sum of fingers shown by both players
- **Option 2:** Rock Paper Scissors - Classic hand gesture battle
- **Option 3:** Number Guessing - Find the secret number (1-100) in 10 attempts

### During Gameplay
- Follow on-screen prompts for each game
- Press `5` to continue playing
- Press `6` to exit and save your score

### View Top Players
Before starting a game, choose:
- **Option 1:** Meet Dhurandhar (highest total score)
- **Option 5:** View Top Rated Player
- **Option 6:** Skip to game

## 📊 Scoring System

| Game | Win | Loss | Draw |
|------|-----|------|------|
| Morra | +1 | -1 | 0 |
| Rock Paper Scissors | +1 | -1 | 0 |
| Number Guessing | +1 | -1 | N/A |

**Opponent Rating:** After each session, receive a rating from 1.0 to 5.0 stars based on gameplay performance.

## 🎯 Game Rules

### Morra
- Both players show 1-5 fingers
- Simultaneously guess the total sum (1-10)
- Correct guess wins the round

### Rock Paper Scissors
- Rock crushes Scissors
- Scissors cuts Paper
- Paper covers Rock

### Number Guessing
- System generates random number (1-100)
- You have 10 attempts
- Hints provided: "higher" or "lower"

## 👨‍💻 Author

**Your Name**
- GitHub: [@TechFourgeBuild](https://github.com/TechFourgeBuild/)

## 🙏 Acknowledgments

- Inspired by traditional hand games from various cultures
- Unicode styling for enhanced terminal aesthetics
- Community feedback and suggestions

## 📸 Screenshots

```
█████████████████████████████████████████████████████████████████
🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥 𝐖𝐄𝐋𝐂𝐎𝐌𝐄 𝐓𝐎 🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥🐦‍🔥
💦💦💦💦💦💦💦💦💦💦💦💦💦💦💦 𝐓𝐡𝐞 💦💦💦💦💦💦💦💦💦💦💦💦💦💦💦
⛈️⛈️⛈️⛈️⛈️⛈️⛈️⛈️⛈️⛈️ 𝐆𝐚𝐦𝐞𝐬𝐨𝐟𝐭 - 𝐓𝐡𝐞 𝐔𝐥𝐭𝐢𝐦𝐚𝐭𝐞 𝐀𝐫𝐞𝐧𝐚 𝐨𝐟 𝐖𝐢𝐭𝐬 ⛈️⛈️⛈️⛈️⛈️⛈️⛈️⛈️⛈️⛈️
█████████████████████████████████████████████████████████████████
```

