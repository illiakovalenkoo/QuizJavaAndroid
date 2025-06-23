# QuizApp - Android Quiz Game

**QuizApp** is a simple Android application built with **Java** that allows users to **play a quiz game** with multiple-choice questions. The application features a minimal user interface and handles basic game logic.

## 1. How to Download and Run the Project

### **Prerequisites**

To run this project, you need:

- **Android Studio Flamingo or newer** – Download from [Android Developers](https://developer.android.com/studio)
- **Android SDK 31+ (API Level 31 or higher)** installed
- **A physical Android device** or an **Android emulator** (e.g., **Pixel 2 API 31**) set up in Android Studio

### **Clone the Repository**

1. **Download the repository**:
   ```sh
   git clone https://github.com/illiakovalenkoo/QuizJavaAndroid.git
   cd QuizJavaAndroid
   ```

### **Open the Project in Android Studio**

1. Open **Android Studio**.
2. Click on **Open** and select the `QuizJavaAndroid` project folder.
3. Wait for Gradle to sync and install dependencies.

### **Run the Application**

#### **Option 1: Run on a Physical Device**

1. Connect an Android phone via USB.
2. Enable **Developer Options** and **USB Debugging** in phone settings.
3. Click **Run** in Android Studio and select your device.

#### **Option 2: Run on an Emulator**

1. Open **Android Studio** and go to **Device Manager**.
2. Create a new virtual device (recommended: **Pixel 2 API 31**).
3. Click **Run** and select the emulator as the target device.

### **Option 3: Install APK on a Device**

If you want to install the pre-built APK file without running the project in Android Studio:

1. **Locate the APK file**:
   - The signed APK file is available at: `app/build/outputs/apk/release/quizapp-release.apk`.
   - If you downloaded it from GitHub Releases, find it in your downloads folder.

2. **Transfer the APK to your phone**:
   - Connect your device via USB and copy the file.
   - Or send it via email/cloud storage and download it on your phone.

3. **Enable unknown sources** (only for manual installation):
   - Go to **Settings > Security > Install unknown apps**.
   - Allow installation from your file manager or browser.

4. **Install the APK**:
   - Open the APK file on your phone and tap **Install**.

5. **Run the app** from your home screen.

## 2. First-Time Execution Issues

- **Gradle Sync Failed** – Ensure you have the latest **Android Studio** and Gradle version.
- **App Crashes on Start** – Ensure you have granted **Storage Permissions** in **Settings > Apps > QuizApp > Permissions** (only needed for external files).
- **Emulator Runs Slowly** – Enable **Hardware Acceleration** in Android Studio settings.
- **APK Installation Blocked** – Enable installation from unknown sources in your device settings.
- **APK Not Found** – Ensure the APK is in the correct location: `app/build/outputs/apk/release/quizapp-release.apk`.

## 3. Project Structure

```
│── src/                           # Source code of the application
│── images/                        # Screenshots and images for documentation
│── doc/                           # README.md file
```
## 4. Tests'
- **img.png** (Loading screen (from icon to start page))
- **img_1.png** (One of questions with 2 possibilities to answer - True or False)
- **img_2.png** (Screen after correct answer with next question button)
- **img_3.png** (Screen after incorrect answer with next question button)
- **img_4.png** (Final screen with result)
## 5. Technologies Used

- **Java (Android SDK)**
- **XML (UI Layouts)**
- **Android Activity Lifecycle** (for handling quiz logic)

## 6. Application Testing

The application has been tested for:

- Basic quiz functionality
- Multiple-choice question handling
- App stability on different Android versions (API 29–33)
- Performance on emulator and real devices
- APK installation and manual execution

## 7. License

This project is licensed under the **MIT License**. You are free to use, modify, and distribute this software with no restrictions. The software is provided "as is", without warranty of any kind.

