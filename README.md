# goSnapPay - Lightweight Payment Gateway

A full-featured, lightweight payment gateway similar to Stripe. Supports tokenized card storage, recurring billing, fraud detection, real-time dashboard, and cloud deployment.

## 🗂️ Folder Structure

```
goSnapPay/
├── backend/
│   ├── src/main/java/com/gosnappay/
│   │   ├── user/
│   │   ├── card/
│   │   ├── billing/
│   │   ├── fraud/
│   │   ├── queue/
│   │   ├── security/
│   │   ├── websocket/
│   │   ├── dashboard/
│   │   └── config/
├── frontend/
│   └── src/components/
├── docker-compose.yml
├── locustfile.py
└── README.md
```

## 🚀 Build & Run

### Prerequisites
- Java 17+
- Node.js + npm
- Docker & Docker Compose

### Steps

1. **Build Backend**
```bash
cd backend
./mvnw clean install
```

2. **Run Full Stack**
```bash
docker-compose up --build
```

3. **Access**
- API: http://localhost:8080
- Dashboard: http://localhost:3000

## 🔐 API Endpoints

| Endpoint                 | Method | Role    | Description                      |
|--------------------------|--------|---------|----------------------------------|
| /api/auth/register       | POST   | Public  | Register user                    |
| /api/auth/login          | POST   | Public  | Get JWT token                    |
| /api/card/tokenize       | POST   | User    | Save card token                  |
| /api/payment/charge      | POST   | User    | Charge tokenized card            |
| /api/dashboard/stats     | GET    | Admin   | Dashboard metrics                |

## ⚙️ Features
- JWT Auth
- PostgreSQL + RabbitMQ + AWS SQS Ready
- AES Encrypted Card Tokens
- Role-based access (USER/ADMIN)
- Vue.js Real-time Dashboard
- Locust load testing

Happy Building! 🎉
