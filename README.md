# 🎲 Snake and Ladder Game (Multithreaded Java Project)

A Java-based console implementation of the classic **Snake and Ladder game** for two players using **multithreading** and **synchronized game mechanics**.

## 🚀 Key Features

- 🧵 **Multithreading:** Two players operate on separate threads simulating real-time concurrent gameplay.
- 🔄 **Synchronized Dice Control:** Ensures turn-based execution using synchronized method on shared `Board`.
- 🐍 **Custom Game Logic:**
  - 🎉 **Ladders:** Land on 7, 19, 31, or 37 → Gain +5 points.
  - 🐍 **Snakes:** Land on 9, 16, 23, 33, 40, 46, or 49 → Lose -8 points.
- 🎯 First player to reach **exactly 50** wins. Overstepping forfeits the turn.

---

## 💻 How to Run

Compile and run the code:

```bash
javac SnakeAndLadderGame.java
java SnakeAndLadderGame
```

Players take turns pressing ENTER to throw the dice.

---
## 🛠️ Concepts Demonstrated

- Java `Thread` and `Runnable` interface  
- `synchronized` method for shared resource handling  
- Console input via `BufferedReader`  
- Use of `Random` for dice rolls  
- Encapsulation and class interaction (`Board` and `GamePlayer`)

---

## ✍️ Author

**Aryika Patni**  

