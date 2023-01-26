var board = [
  [9, 9, 9, 9, 9, 9, 9, 9, 9, 9],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [9, 0, 0, 0, 0, 0, 0, 0, 0, 0],
];

function gameStart() {
  var myTable = document.getElementById("boardTable");
  for (let i = 1; i <= 10; i++) {
    for (let j = 1; j <= 10; j++) {
      myTable.rows[i].cells[j].innerHTML = "0";
      board[i][j] = 0;
    }
  }
  shipLength = 4;
  //ship size is 4
  //random position of ship -> between 1 and 7
  //random both row and column
  //random between vertical and horizontal for ship lineup
  for (let index = 0; index < 3; index++) {
    shipRowLocation = Math.floor(Math.random() * 7) + 1;
    shipColumnLocation = Math.floor(Math.random() * 7) + 1;
    horiOrVerti = Math.floor(Math.random() * 2);

    for (let index2 = 0; index2 < shipLength; index2++) {
      if (horiOrVerti == 0) {
        //horizontal
        board[shipRowLocation][shipColumnLocation + index2] = 1;
      } else {
        //vertical
        board[shipRowLocation + index2][shipColumnLocation] = 1;
      }
    }
  }
}
function showShip() {
  var myTable = document.getElementById("boardTable");
  for (let row = 1; row <= 10; row++) {
    for (let column = 1; column <= 10; column++) {
      if (board[row][column] != 0) {
        myTable.rows[row].cells[column].innerHTML = board[row][column];
      }
    }
  }
}

function shot() {
  var userRow = document.getElementById("rowChosen").value;
  var userColumn = document.getElementById("colChosen").value;
  var myTable = document.getElementById("boardTable");
  if (board[userRow][userColumn] == 1) {
    document.getElementById("hitOrMiss").value = "HIT!";
    myTable.rows[userRow].cells[userColumn].innerHTML = 1;
    myTable.rows[userRow].cells[userColumn].style.backgroundColor = "green";
  } else {
    document.getElementById("hitOrMiss").value = "MISS!";
    myTable.rows[userRow].cells[userColumn].innerHTML = -1;
    myTable.rows[userRow].cells[userColumn].style.backgroundColor = "blue";
  }
}

function grade() {
  //shot less than 30 = A
  //create array to count number of shots ship
}
