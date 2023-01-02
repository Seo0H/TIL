import logo from './logo.svg';
import './App.css';
import React, { Link } from 'react';

function Header(props) {
  return (
    <header>
      <h1>
        <a href="/" onClick={e => {
          e.preventDefault();
          props.onChangeMode();
        }}>{props.title}</a>
      </h1>
    </header>
  );
}

function Nav(props) {
  const lis = [];

  for (let i = 0; i < props.topics.length; i++) {
    let t = props.topics[i];
    lis.push(
    <li key={t.id}>
      <a id={t.id}
        href={`/read/${t.id}`}
        onClick={e => {
        e.preventDefault();
        props.onChangeMode(e.target.id);
      }}>
      {t.title}
      </a>
    </li>
    );
  }

  // 자동으로 생성한 테그에는 리액트가 추적을 할 때 근거가 필요하다.
  // 따라서 고유한 키 값을 넣어줘야 한다.

  return (
    <nav>
      <ol>
        {lis}
      </ol>
    </nav>
  );
}

function Article(props) {
  return (
    <article>
      <h2>{props.title}</h2>
      {props.body}
    </article>
  );
}


function App() {
  const topics = [
    {
      id: 1,
      title: 'html',
      body: 'html is ...'
    },
    {
      id: 2,
      title: 'css',
      body: 'css is ...'
    },
    {
      id: 3,
      title: 'js',
      body: 'js is ...'
    },
  ];

  return (
    <div>
      <Header title="REACT" onChangeMode={() => { alert('Header'); }} />
      <Nav topics={topics} onChangeMode={(id) => {
        alert(id);
      }} />
      <Article title="Welcome" body="Hello, WEB" />
    </div>
  );
}

export default App;
