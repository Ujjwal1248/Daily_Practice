import React from 'react';
import Person from './components/Person';
import UseMemo from './components/UseMemo';
import UseCallback from './components/UseCallback';

const App = () => {
  return (
    <div>
      {/* <Person /> */}
      <UseMemo />
      <UseCallback />
    </div>
  );
}

export default App;
