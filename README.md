# VisionMate — Smart Navigation for the Visually Impaired

> A real-time object detection and navigation assistant for visually impaired users, built with Android, ML Kit, Firebase, and CameraX.

---

## 🦾 About the Project

**VisionMate** is an Android-based smart navigation assistant designed to empower visually impaired users by helping them navigate the world safely and independently. Using on-device AI object detection, voice-guided navigation, and real-time alerts, GuideAI offers enhanced environmental awareness for users — turning a smartphone into a digital companion.

---

## 🚀 Features

- 🎯 **Real-Time Object Detection**  
  Uses Firebase ML Kit + CameraX to detect and describe obstacles and surroundings.

- 🗺️ **Voice Navigation Support**  
  Turn-by-turn audio navigation using GPS and Google Maps API.

- 🔊 **Audio Feedback**  
  Real-time voice alerts like:  
  > “Stairs ahead.”  
  > “Person 3 meters away on your right.”

- 🧠 **Offline Detection Support**  
  On-device inference for object detection using ML Kit — even without an internet connection.

- 🗣️ **Voice Commands**  
  Users can interact hands-free via speech (e.g. start/stop navigation, SOS mode).

- ⚡ **Emergency SOS Mode**  
  Send live location and emergency messages to caregivers with a single voice command or button press.

---

## 🛠️ Tech Stack

| Tech                | Purpose                         |
|---------------------|---------------------------------|
| Android (Jetpack Compose) | UI & app architecture            |
| Firebase ML Kit     | Object Detection (on-device & cloud) |
| CameraX             | Real-time camera feed management |
| Google Maps API     | Navigation & location services   |
| Text-to-Speech (TTS)| Voice alerts                    |
| Speech Recognition  | Voice command input             |
| Firebase Realtime DB / Firestore | (Optional) User data, history, preferences |

---

## 💡 How it Works

1. **CameraX** streams the live feed from the device camera.
2. **Firebase ML Kit** detects and classifies objects in real-time.
3. Detected objects are described via **Text-to-Speech (TTS)** for the user.
4. **Google Maps API** provides walking directions with audio instructions.
5. **Voice Commands** allow users to control the app hands-free.
6. **SOS Mode** can alert emergency contacts with GPS location and surroundings snapshot.

---

## ⚠️ Disclaimer

This app is designed to **assist** and support visually impaired users, but it is not a substitute for caution or human supervision in high-risk environments. Always use with awareness of your surroundings.

---

## 🤝 Contributing

Contributions are welcome!  
If you'd like to improve GuideAI or report issues, please open a Pull Request or submit an Issue.

---


## 📢 Credits
Special thanks to Firebase, Google Maps API, and the open-source Android community.

---

