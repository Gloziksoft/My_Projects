const express = require('express');
const app = express();
const PORT = 3000;

app.use(express.json());

app.get('/', (req, res) => {
  res.send('Hello from Node.js server!');
});

app.get('/about', (req, res) => {
  res.send('Toto je stránka About.');
});

app.get('/api/users', (req, res) => {
  res.json([
    { id: 1, name: 'Peter' },
    { id: 2, name: 'Jana' }
  ]);
});

app.post('/api/users', (req, res) => {
  const { name } = req.body;
  res.json({ id: Date.now(), name });
});

app.listen(PORT, () => {
  console.log(`✅ Server beží na http://localhost:${PORT}`);
});
