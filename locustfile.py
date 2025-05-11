from locust import HttpUser, task, between

class LoadTest(HttpUser):
    wait_time = between(1, 3)

    @task
    def register_and_pay(self):
        self.client.post("/api/auth/register", json={"username": "loaduser", "password": "123", "role": "USER"})
        token = self.client.post("/api/auth/login", json={"username": "loaduser", "password": "123"}).text
        self.client.post("/api/card/tokenize", json={"cardNumber": "1234567890123456", "expiry": "12/26", "cvv": "123"})
        self.client.post("/api/payment/charge", json={"cardToken": "sample-token", "amount": 5000, "merchantId": "M123"})
