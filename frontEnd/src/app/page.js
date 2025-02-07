"use client";

import { useState } from 'react';

export default function Home() {
  const [value, setValue] = useState('');
  const [fromUnit, setFromUnit] = useState('');
  const [toUnit, setToUnit] = useState('');
  const [result, setResult] = useState(null);

  const handleConvert = async () => {
    try {
      const response = await fetch('http://localhost:8081/api/convert', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ value: parseFloat(value), fromUnit, toUnit }),
      });
  
      if (!response.ok) {
        throw new Error('Dönüşüm başarısız oldu');
      }
  
      const result = await response.text(); // Yanıt doğrudan text (string) olarak alınır.
  
      if (isNaN(result)) {
        throw new Error('Geçersiz yanıt formatı: Sayı bekleniyordu.');
      }
  
      setResult(parseInt(result, 10)); // String olan yanıtı tam sayıya çeviriyoruz.
    } catch (error) {
      console.error('Hata:', error.message);
    }
  };
  
  

  return (
    <div>
      <h1>Unit Converter</h1>
      <div>
        <input
          type="text"
          placeholder="Enter the value to convert"
          value={value}
          onChange={(e) => setValue(e.target.value)}
        />
        <input
          type="text"
          placeholder="Unit to Convert from"
          value={fromUnit}
          onChange={(e) => setFromUnit(e.target.value)}
        />
        <input
          type="text"
          placeholder="Unit to Convert to"
          value={toUnit}
          onChange={(e) => setToUnit(e.target.value)}
        />
        <button onClick={handleConvert}>Convert</button>
      </div>
      {result !== null && (
        <div>
          <h2>Result: {result}</h2>
          <button onClick={() => setResult(null)}>Reset</button>
        </div>
      )}
    </div>
  );
}