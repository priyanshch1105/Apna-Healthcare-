<h1>📱 APNA Healthcare – Mental Health Application</h1>
<h1><br>📖 Software Requirements Specification (SRS)</h1>
<h2>1. Introduction</h2>
<h3>1.1 Purpose</h3>

The purpose of this project is to provide a mental health mobile application that offers users immediate access to healthcare resources, appointment booking, survey-based analysis, and AI chatbot support.

<h3>1.2 Scope</h3>

The app helps individuals (students, employees, and general users) manage mental health by offering:

Trusted healthcare tips (WHO, NIH).

Meditation guides & stress-relief exercises.

Appointment booking with professionals.

AI chatbot for 24/7 assistance.

TM program resources and support.

Personalized recommendations via surveys.

<h3>1.3 References</h3>

WHO Mental Health Guidelines (https://www.who.int/health-topics/mental-health#tab=tab_1)

National Library of Medicine (https://www.nlm.nih.gov/)

Flutter Docs (https://flutter.dev/docs)

Dart Docs (https://dart.dev/guides)

Firebase Docs (https://firebase.google.com/docs)

Node.js Docs (https://nodejs.org/en/docs/)

Dialogflow Chatbot (https://cloud.google.com/dialogflow/docs)

<h2>2. Overall Description</h2>
<h3>2.1 Product Perspective</h3>

The app will be built using Flutter (frontend) with Node.js + Firebase (backend).

<h3>High-Level Architecture</h3>

Frontend: Flutter, Dart, Android Studio

Backend: Node.js, Firebase

Services: Chatbot (Dialogflow / GPT API), Push Notifications, Appointment Booking API

<h3>2.2 Product Functions</h3>

User Registration & Authentication

Mental Health Surveys & Analysis

Healthcare Content (WHO/NIH Tips)

Appointment Booking with Doctors/Therapists

AI Chatbot for Assistance

TM Program Support (videos, guides, feedback form)

Wellness Section (meditation, stress relief, anxiety videos)

Feedback & Support System

<h3>2.3 User Characteristics</h3>

General Users: Students, employees, individuals.

Healthcare Providers: Therapists, doctors, TM coaches.

Admin Team: Content and feedback management.

<h3>2.4 Constraints</h3>

Requires active internet connection.

Android 8.0+ supported devices (future iOS support).

Must comply with privacy & security standards (HIPAA/GDPR if global).

<h2>3. Specific Requirements</h2>
<h3>3.1 Functional Requirements</h3>

🔑 User Authentication (Email, Phone, Google Sign-in).

📝 Survey Forms for problem assessment & personalized recommendations.

📚 Healthcare Content with verified WHO/NIH tips.

📅 Appointment Booking (video/audio consults).

🤖 AI Chatbot (mental health queries & resources).

🧘 TM Program (guides, videos, feedback submission).

🧾 Wellness Section (articles, meditation, exercises).

💬 Feedback & Support Forms.

<h3>3.2 Non-Functional Requirements</h3>

Performance: ≤ 3 sec response time.

Scalability: Up to 100k concurrent users.

Security: Firebase Auth + Firestore Rules.

Usability: Accessible UI/UX.

Availability: 99.5% uptime.

<h3>3.3 External Interfaces</h3>

UI: Flutter Material Design.

Backend APIs: Firebase + Node.js.

Chatbot: Dialogflow or GPT API.

Communication: HTTPS secured transfer.

<h2>4. Tech Stack</h2>

Frontend: Flutter
 + Dart

Backend: Node.js

Database & Auth: Firebase

Chatbot: Dialogflow
 / GPT API

Design: Figma

IDE: Android Studio

<h2>5. Appendices</h2>

📸 Figma UI Mockups (to be added)

📄 API Documentation (to be added)

🧾 WHO & NIH Resources (to be updated regularly)
