{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
let numbers = [2, 4, 8, 3, 21];\
\
\
function addNumber(array, number) \{\
    array.push(number);\
\}\
\
\
function removeNumber(array, number) \{\
    const index = array.indexOf(number);\
    if (index !== -1) \{\
        array.splice(index, 1);\
    \}\
\}\
\
\
function sortNumbers(array) \{\
    return array.slice().sort((a, b) => a - b);\
\}\
\
\
function calculateSum(array) \{\
    return array.reduce((sum, num) => sum + num, 0);\
\}\
\
\
function calculateAverage(array) \{\
    if (array.length === 0) return 0;\
    const sum = calculateSum(array);\
    return sum / array.length;\
\}\
\
\
console.log("Initial array:", numbers);\
\
addNumber(numbers, 10);\
console.log("Array after adding 10:", numbers);\
\
removeNumber(numbers, 3);\
console.log("Array after removing 3:", numbers);\
\
const sortedNumbers = sortNumbers(numbers);\
console.log("Sorted array:", sortedNumbers);qt\
\
const sum = calculateSum(numbers);\
console.log("Sum of array elements:", sum);\
\
const average = calculateAverage(numbers);\
console.log("Average of array elements:", average);\
\
}