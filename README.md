# CSC402 - Lab 1 Submission

## Student Information
- **Package Name:** `edu.iau.cshj.csc402.lab1`
- **Project Name:** `CSC402 Lab1`

---

## Part A — Project Structure & Manifest
### Task A & Tasks 1–3 Summary
- **Android Studio & SDK Setup:** Configured minimum SDK to API 24 using Kotlin DSL[cite: 9].
- **AndroidManifest.xml:** Inspected components, activities, and permissions.

---

## Part B — Configuration, Running and Resources

### 📌 Task 4: Gradle Build Files & Settings Table
*Complete based on your project settings[cite: 9]:*

| Setting | Your value | In one sentence, what does it control? |
| :--- | :--- | :--- |
| **namespace** | `edu.iau.cshj.csc402.lab1` | Identifies the unique namespace for the compiled R and BuildConfig classes. |
| **applicationId** | `edu.iau.cshj.csc402.lab1` | Uniquely identifies the app package on the device and Google Play Store. |
| **compileSdk** | *(e.g., 34 / 35)* | The Android API version the code is compiled against[cite: 9]. |
| **minSdk** | `24` | The oldest Android version that is allowed to install the application[cite: 9]. |
| **targetSdk** | *(e.g., 34 / 35)* | The API level the app is tested and optimized to run against[cite: 9]. |
| **versionCode** | `1` | An integer representing the internal version version number of the app release. |
| **versionName** | `1.0` | The user-visible version string displayed for the application. |

- **Q3 (minSdk Trade-off):** *[Write your answer regarding raising minSdk to 34, device percentage reached, and trade-off vs definition]*

---

### 📌 Task 5: Build and Run the App
- **Execution:** Successfully ran the application on the Emulator / Real Device.
- **Q4 (Build Times):** 
  - *First build time:* `[e.g., 42s]`[cite: 10, 11]
  - *Second build time:* `[e.g., 5s]`[cite: 10, 11]
  - *Explanation of difference:* Subsequent builds take significantly less time because Gradle caches previously compiled tasks and resources.

---

### 📌 Task 6: String Resources (`strings.xml`)
- Configured custom string resources in `res/values/strings.xml`[cite: 11]:
  - `app_name`: `CSC 402 Lab 1`[cite: 11]
  - `welcome_message`: `Welcome to Mobile Application Programming`[cite: 11]
  - `student_name`: `[Your Name]`[cite: 11]
- Updated `MainActivity.kt` using `stringResource()` to decouple text from hardcoded Kotlin strings[cite: 11].

---
