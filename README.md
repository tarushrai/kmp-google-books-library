<ins>**GoogleBooksKMP – Kotlin Multiplatform Library for Google Books API**</ins>

📌 A simple Kotlin Multiplatform (KMP) library that fetches book data from the Google Books API for Android & iOS.

<ins>Features</ins>:

✅ Fetches books from Google Books API using Ktor
✅ Works on Android & iOS using Kotlin Multiplatform
✅ Uses expect/actual for platform-specific implementations
✅ Demonstrates best practices for building KMP libraries

<ins>Project Structure</ins>:

📦 kmp-google-books-library  
 ┣ 📂 src  
 ┃ ┣ 📂 commonMain  ➝ (Shared Kotlin code)  
 ┃ ┃ ┗ 📜 GoogleBooksKMP.kt  
 ┃ ┣ 📂 androidMain  ➝ (Android-specific code)  
 ┃ ┃ ┗ 📜 PlatformAndroid.kt  
 ┃ ┣ 📂 iosMain  ➝ (iOS-specific code)  
 ┃ ┃ ┗ 📜 PlatformIOS.kt  
 ┗ 📜 README.md

 <ins>Why This Project?</ins>
 
This project is part of Google Summer of Code (GSoC) 2025 and demonstrates how to build a proper KMP library while working with a real-world Google service.
