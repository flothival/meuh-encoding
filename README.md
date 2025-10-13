# MEUH Encoder 🐄

A fun and creative text encoder that converts text into a **custom binary-based language** using the letters **M, E, U, H**.

Uppercase letters represent binary `1`, lowercase letters represent binary `0`. Spaces are used to separate groups of 4 bits for readability.

---

## Features

- Encode any text into the MEUH format
- Decode MEUH-encoded strings back to the original text
- Simple command-line interface (CLI)

---

## How It Works

### Encoding

Each character is converted to its **8-bit binary representation**. Then:

- **First 4 bits** → mapped to letters `M`, `E`, `U`, `H`  
- **Last 4 bits** → mapped to letters `M`, `E`, `U`, `H`  
- **Uppercase** = `1`, **Lowercase** = `0`  
- Spaces are inserted after each group of 4 letters  

**Example:**

```text
Original text: "A"
Binary:        01000001
Encoded:       mEUh MEUh
