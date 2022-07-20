import React from 'react';
import { render, screen } from '@testing-library/react';
import App from './App';

test('renders mservice A and B text', () => {
  render(<App />);
  const textElementA = screen.getByText(/MService A Message/i);
  const textElementB = screen.getByText(/MService B Message/i);

  expect(textElementA).toBeInTheDocument();
  expect(textElementB).toBeInTheDocument();
});
