//============================================================================
// Name        : Driver.cpp
//============================================================================

#include <iostream>
#include <string>
using namespace std;

//Creating classes (blueprints)
class Greet {

	public:
		string hi;
		int option;
		Greet (string text, int number){
			hi = text;
			option = number;
		}
};

class parting {
public:

	string farewell;
	int option;
	parting (string text, int number){
			farewell = text;
			option = number;
}
};


//if <string> isn't included from the standard library then strings are an array of characters
char time[] = "1: day & 2: night";


int main() {

	int number; //Initialize integer variable

	//Creating objects using class.
	Greet greetings ("Good Morning", 1);

	parting bye ("Good Night", 2);


	//Condition

	for (int i = 0; i < sizeof(time); i++){
		cout << time[i];

	}
	cout << endl;

	//loop
	bool s = false;
	while (not s) {
	cout << "enter 1 or 2" << endl;
	cin >> number;
	//decisions
	if (number == greetings.option) {
		cout << greetings.hi << endl;
		cout << greetings.option;
		s = true;
	}
	if (number == bye.option){
		cout << bye.farewell << endl;
		cout << bye.option;
		s = true;
	}
	else {
		continue;
	}
	};
	return 0;
};
